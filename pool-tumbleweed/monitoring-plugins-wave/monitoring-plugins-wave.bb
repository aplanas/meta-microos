SUMMARY = "Check wave signal strength"
DESCRIPTION = "Check the wave signal strength via SNMP."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-wave-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "7f2f2f59970b382b186b3522cc4d062b98be01f992cc8f06e80acafe7ef7531f8a4d3d25048ae9e37b8767908a4cc52c76bdcf847ed817105093ccf36b30f0d2"

RPROVIDES:${PN} += "monitoring-plugins-wave \
nagios-plugins-wave"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
net-snmp \
perl"

inherit rpm
