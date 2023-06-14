SUMMARY = "Check RPC service"
DESCRIPTION = "Check if a rpc service is registered and running using rpcinfo."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-rpc-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "8db52a2887008e79da015d168f67561a4a92e2db17e03f1767a9ffcf8ac37238598ddf66c10c5ce75b4ed88b587c259f8632442fcc666706ba36ede1d1016184"

RPROVIDES:${PN} += "monitoring-plugins-rpc \
nagios-plugins-rpc"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl \
rpcbind"

inherit rpm
