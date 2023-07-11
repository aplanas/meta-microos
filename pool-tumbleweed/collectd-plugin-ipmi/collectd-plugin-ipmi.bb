SUMMARY = "OpenIPMI Monitoring Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor sensors using the OpenIPMI \
library for IPMI enabled systems."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-ipmi-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "5bdd7b3ff29ba71c765cd55faee6a12d9be0eb8467d67e9825898266e30c59abe2de56503cf3f405c56d4cc38dfc953c93f351a1048fac010d69db56f33507cf"

RPROVIDES:${PN} += "collectd-plugin-ipmi"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libOpenIPMI.so.0 \
libOpenIPMIpthread.so.0 \
libc.so.6"

inherit rpm
