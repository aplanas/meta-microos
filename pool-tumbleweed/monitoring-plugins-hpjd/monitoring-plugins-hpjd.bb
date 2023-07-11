SUMMARY = "Check status of an HP printer"
DESCRIPTION = "This plugin tests the STATUS of an HP printer with a JetDirect card."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-hpjd-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "d102b3c11f855200c7851ffa11766f0d98e23267ee42c2ced7fa841fb014efeed94959709cc404d278f47f8cf2d76c563e84061fc1df360342c0464a64027cc0"

RPROVIDES:${PN} += "monitoring-plugins-hpjd \
nagios-plugins-hpjd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
net-snmp"

inherit rpm
