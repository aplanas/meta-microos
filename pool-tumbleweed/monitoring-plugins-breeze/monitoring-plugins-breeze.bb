SUMMARY = "Monitor Breezecom wireless equipment"
DESCRIPTION = "This plugin reports the signal strength of a Breezecom wireless equipment."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-breeze-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "269f184e002eeec8353ec3bd6e930d5bc18e1233e25c1e43cb172bb0ffa9ab9c97bf5bce1ed690d699e518d7d9190569561325a8d7278c0c1fce5599c904cece"

RPROVIDES:${PN} += "monitoring-plugins-breeze \
nagios-plugins-breeze"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
net-snmp \
perl"

inherit rpm
