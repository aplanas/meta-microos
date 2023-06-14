SUMMARY = "Monitor Breezecom wireless equipment"
DESCRIPTION = "This plugin reports the signal strength of a Breezecom wireless equipment."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-breeze-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "b1df83346e3563083268c304b5469875a0be8e0ab1d3a2c28482a0ae67588f84c0267869058e6318dbd4b3d88844764452f20f3b784b8c828b89677314bf0937"

RPROVIDES:${PN} += "monitoring-plugins-breeze \
nagios-plugins-breeze"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
net-snmp \
perl"

inherit rpm
