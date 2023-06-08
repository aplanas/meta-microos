SUMMARY = "TCP Modbus Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to communicate with TCP Modbus devices."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-modbus-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "d607cc140bc63df34b760d82ebcbb3ad92ff50598e5599bcaab9ef94290de7a1346adcd0416248aa6dcff23c34f84add77294d7659f5c2ad3188440ec121e88e"

RPROVIDES:${PN} += "collectd-plugin-modbus collectd-plugin-modbus(aarch-64)"
RDEPENDS:${PN} += "collectd ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libmodbus.so.5()(64bit)"

inherit rpm
