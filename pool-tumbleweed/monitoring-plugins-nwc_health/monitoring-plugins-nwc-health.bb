SUMMARY = "This plugin checks the health of network components and interfaces"
DESCRIPTION = "This plugin checks the hardware health and various interface metrics of \
network components like switches and routers."
LICENSE = "GPL-2.0-or-later"

PV = "10.9.1"

RPM_NAME = "monitoring-plugins-nwc_health-10.9.1-1.1.noarch.rpm"
RPM_HASH = "b0c0ccd20b6d7cd2973f2e279cf7656860da39ccac8fcde10a8aef7f830d025fd5a875610508e4cbaf0a4a5e10e32380e0063e5ee91c9e28107cf2de3456ab66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-nwc_health \
nagios-plugins-nwc_health"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(File::Slurp) \
perl(JSON) \
perl(JSON::XS) \
perl-Nagios-Plugin \
perl-Net-SNMP"

inherit rpm
