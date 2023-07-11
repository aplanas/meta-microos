SUMMARY = "UBIFS plugin for collectd"
DESCRIPTION = "Optional collectd plugin for reporting block state of flash memory devices with UBIFS filesystem."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-ubi-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "c1bbaa25a76bbd9365eeda2154e3a09c5df762b7173319583bd8690e20ef31c98a647ccf8aa84f1af4ec33a743f4004921afa4d3970036574ef0e888b8d44afa"

RPROVIDES:${PN} += "collectd-plugin-ubi"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
