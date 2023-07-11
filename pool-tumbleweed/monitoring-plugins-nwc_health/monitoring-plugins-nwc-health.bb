SUMMARY = "This plugin checks the health of network components and interfaces"
DESCRIPTION = "This plugin checks the hardware health and various interface metrics of \
network components like switches and routers."
LICENSE = "GPL-2.0-or-later"

PV = "10.12.1.8"

RPM_NAME = "monitoring-plugins-nwc_health-10.12.1.8-1.1.noarch.rpm"
RPM_HASH = "ffe8a86eb84990f874149774bc9f4444afb7d9768be5a6e55613d3b819a2245b28f0c035085184b8bd6c57502a9d7f51b1d5944fd6e2b550a4ec4a7e2973e7af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-nwc-health \
nagios-plugins-nwc-health"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-File--Slurp \
perl-JSON \
perl-JSON--XS \
perl-Nagios-Plugin \
perl-Net-SNMP"

inherit rpm
