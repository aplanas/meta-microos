SUMMARY = "Machine Check Exceptions plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor machine check exceptions."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-mcelog-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "05fd3772f832866febe0286d11ba226cfcd3fc99144939a3ad0efc2d6b4b455fa3bcff8c87e19cc2c37745bb2f1a234b122e923771a84025a930b4a99372e6c1"

RPROVIDES:${PN} += "collectd-plugin-mcelog"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
