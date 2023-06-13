SUMMARY = "UBIFS plugin for collectd"
DESCRIPTION = "Optional collectd plugin for reporting block state of flash memory devices with UBIFS filesystem."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-ubi-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "0ac565f48e32a2ccb9c94396b0eb3b42f4050bec931c4b4650e611e484a13207a1cff64b42be1faf0d2de61d2fd7e3ac8ae51c3758411f5d8ac18bae8ad9a5ad"

RPROVIDES:${PN} += "collectd-plugin-ubi \
collectd-plugin-ubi(aarch-64)"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
