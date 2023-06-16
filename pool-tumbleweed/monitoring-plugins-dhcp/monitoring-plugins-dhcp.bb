SUMMARY = "Check DHCP servers"
DESCRIPTION = "This plugin tests the availability of DHCP servers on a network. \
 \
Please read \
/usr/share/doc/packages/monitoring-plugins-dhcp/README.SUSE-check_dhcp \
for details how to setup this check."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-dhcp-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "8dd2ba79e6a80d9f2c8312fbb6f310dc1aba61d0dfa161f1bc13ff5fd497b1e8bed69490137cc62ad78b90d47ec321a7f36063fea024bb54f5b6e646385a1161"

RPROVIDES:${PN} += "config-monitoring-plugins-dhcp \
monitoring-plugins-dhcp \
nagios-plugins-dhcp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
