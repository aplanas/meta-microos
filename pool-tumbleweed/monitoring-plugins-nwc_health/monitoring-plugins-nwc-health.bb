SUMMARY = "This plugin checks the health of network components and interfaces"
DESCRIPTION = "This plugin checks the hardware health and various interface metrics of \
network components like switches and routers."
LICENSE = "GPL-2.0-or-later"

PV = "11.0.1"

RPM_NAME = "monitoring-plugins-nwc_health-11.0.1-1.1.noarch.rpm"
RPM_HASH = "273298305cb81531570b2346148dcedf2fad317ec0c1a2858a6ccd71c2475e3e1a5a1e17cf190c8e85d83f692af453c2bf30295fad9d1770933590db5cdcd49f"
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
