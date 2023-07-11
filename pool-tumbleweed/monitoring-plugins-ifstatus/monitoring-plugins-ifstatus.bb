SUMMARY = "Monitor operational status network interfaces"
DESCRIPTION = "This plugin monitors operational status of each network interface on the target \
host."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-ifstatus-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "19f5e3f01a7ad702d5f5b644647cf951925263fb6e4b2b3ae021b34a014fb35283421f214a5a8f4f67a6c67f27db072ed1974019f2080726dad1bf2a6f5f7f28"

RPROVIDES:${PN} += "monitoring-plugins-ifstatus \
nagios-plugins-ifstatus"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl-Net-SNMP"

inherit rpm
