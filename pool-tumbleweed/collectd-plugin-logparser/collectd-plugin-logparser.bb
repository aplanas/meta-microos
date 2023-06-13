SUMMARY = "Logparser plugin for collectd"
DESCRIPTION = "Optional collectd plugin for filtering and parsing logs."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-logparser-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "a820cdc943e294ec0e506c4873c37b6ab0b9eb9288065ab7eb87c081c534a12dc5820cfeb63a9dbd0bba7ed2bd193da5ffd474a23d68e578ddaba52f68bcca0b"

RPROVIDES:${PN} += "collectd-plugin-logparser \
collectd-plugin-logparser(aarch-64)"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
