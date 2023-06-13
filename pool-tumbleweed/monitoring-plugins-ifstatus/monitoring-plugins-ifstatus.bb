SUMMARY = "Monitor operational status network interfaces"
DESCRIPTION = "This plugin monitors operational status of each network interface on the target \
host."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-ifstatus-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "bee873fd827f08ba97ddd64b099d7b2ea3aa522a9203dbb1ac41d4cd24038b2150e34f3a7d860c95d242a3001caf518c66c80ed9fcd5c352bfee7e8f7364105b"

RPROVIDES:${PN} += "monitoring-plugins-ifstatus \
monitoring-plugins-ifstatus(aarch-64) \
nagios-plugins-ifstatus"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl-Net-SNMP"

inherit rpm
