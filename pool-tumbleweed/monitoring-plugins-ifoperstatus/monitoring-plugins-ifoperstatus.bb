SUMMARY = "Monitor network interfaces"
DESCRIPTION = "This plugin monitors operational status of a particular network interface on \
the target host."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-ifoperstatus-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "e3dd4b24a38308dbe36a016566a4f02f1fd01c4e0cd7decb2b77d066576f37a8e11ef74b6fd8c7de549e6492a727a7da151a6b43332ea067ed49499d532f66e7"

RPROVIDES:${PN} += "monitoring-plugins-ifoperstatus \
nagios-plugins-ifoperstatus"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl-Net-SNMP"

inherit rpm
