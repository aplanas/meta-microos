SUMMARY = "Monitor Servertech devices that use the Sentry3 MIB"
DESCRIPTION = "This Nagios check monitors Servertech devices that use the Sentry3 MIB. \
 \
It checks the following: \
 \
1) Environmental temperature (Auto-detects all sensors) \
2) Environmental humidity (Auto-detects all sensors) \
3) Input power (Auto-detects all input feeds)"
LICENSE = "GPL-2.0+"

PV = "2012"

RPM_NAME = "monitoring-plugins-sentry3-2012-101.14.noarch.rpm"
RPM_HASH = "034ae4b0c2f91dabb93ab3477cfdb216b22b6611c9d8badff01df1c08457f8c06cd880f5344246357a952c1a9f977b5d6083f113f1b1ecf8b0d394e36712245e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-sentry3 \
nagios-plugins-sentry3"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(Nagios::Plugin) \
perl(Net::SNMP)"

inherit rpm
