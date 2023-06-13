SUMMARY = "Machine Check Exceptions plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor machine check exceptions."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-mcelog-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "266006b0c9c3df626400c513b9d1b0f01524410e6b7feef2eb2a28fe58d8e09deda551c03e2460bfb4850c96c4e2bc862b677c1e50945b72d851e2c44dd7a26f"

RPROVIDES:${PN} += "collectd-plugin-mcelog \
collectd-plugin-mcelog(aarch-64)"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
