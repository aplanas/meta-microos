SUMMARY = "Check wave signal strength"
DESCRIPTION = "Check the wave signal strength via SNMP."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-wave-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "12dfc776be5f88e2061df302fb32facc98e71e980aecbb4131ddc01d98ce3c7f7fc3156f3aaecb022ec9f1367b9257e0c2ab66ec870dcf2667e10736a29072cb"

RPROVIDES:${PN} += "monitoring-plugins-wave \
monitoring-plugins-wave(aarch-64) \
nagios-plugins-wave"
RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
net-snmp \
perl"

inherit rpm
