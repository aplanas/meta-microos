SUMMARY = "OpenIPMI Monitoring Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor sensors using the OpenIPMI \
library for IPMI enabled systems."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-ipmi-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "1ca5ef9a37e77d6b770ca49499aa3f68d135df3e180746e9111c2bd1cd5af857286c31e1c220b7c31312fb6f518e53c300b1c35e375615d7dc7936d4131d6bca"

RPROVIDES:${PN} += "collectd-plugin-ipmi \
collectd-plugin-ipmi(aarch-64)"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libOpenIPMI.so.0()(64bit) \
libOpenIPMIpthread.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
