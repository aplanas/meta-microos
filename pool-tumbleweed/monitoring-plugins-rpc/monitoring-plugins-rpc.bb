SUMMARY = "Check RPC service"
DESCRIPTION = "Check if a rpc service is registered and running using rpcinfo."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-rpc-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "45ed31d41610aee2068ca78db73289fe18689496b6b19a8763bf8765ef0e5419bea60ec737e3c252e7d2e3663634b8eb5dcd9174429e76acf2e1c244c00753d1"

RPROVIDES:${PN} += "monitoring-plugins-rpc \
nagios-plugins-rpc"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl \
rpcbind"

inherit rpm
