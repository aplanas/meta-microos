SUMMARY = "TCP Modbus Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to communicate with TCP Modbus devices."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-modbus-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "5c29fcfced0ff9820b4637e1a838f613156909e0036fa17d557751b43c0aa91fe4e3cf7ee3b29413999988ea3468cd643a53ce3f1ed5ee0e791b0453b91152c7"

RPROVIDES:${PN} += "collectd-plugin-modbus"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmodbus.so.5"

inherit rpm
