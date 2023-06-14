SUMMARY = "Monitor network interfaces"
DESCRIPTION = "This plugin monitors operational status of a particular network interface on \
the target host."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-ifoperstatus-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "a7d6ed62e97b4246233cf294316514796f7e84b107608929967db47a364e5934d41be937d09d1b9607d48508a7c2c42de2671363f5318be7eb8e823325344dbe"

RPROVIDES:${PN} += "monitoring-plugins-ifoperstatus \
nagios-plugins-ifoperstatus"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl-Net-SNMP"

inherit rpm
