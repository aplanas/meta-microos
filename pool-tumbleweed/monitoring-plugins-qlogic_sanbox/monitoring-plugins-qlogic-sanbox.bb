SUMMARY = "Check QLogic FC Sanboxes"
DESCRIPTION = "Nagios plugin, allowing to check QLogic FC Sanboxes. \
 \
This plugin has been tested with the following QLogic switches: \
 \
SANbox 5200 FC Switch \
SANbox 5202 FC Switch \
SANbox 5600 FC Switch \
SANbox 5602 FC Switch \
SANbox 5800 FC Switch"
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "monitoring-plugins-qlogic_sanbox-1.4-1.5.noarch.rpm"
RPM_HASH = "a4ed72703089395afe69252ac2ab74cb72640f93f39c1abbf9a1b0edf33e491851009940d6999fe71f158d9ee05cc0bdb14608cad583e03d0426460af10ede93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-qlogic_sanbox \
nagios-plugins-qlogic_sanbox"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(Getopt::Long) \
perl(Net::Ping) \
perl(Net::SNMP) \
perl(Pod::Usage)"

inherit rpm
