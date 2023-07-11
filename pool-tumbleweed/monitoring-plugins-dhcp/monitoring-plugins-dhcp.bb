SUMMARY = "Check DHCP servers"
DESCRIPTION = "This plugin tests the availability of DHCP servers on a network. \
 \
Please read \
/usr/share/doc/packages/monitoring-plugins-dhcp/README.SUSE-check_dhcp \
for details how to setup this check."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-dhcp-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "33472c9e63bf760baa9b2316de12173dc37c6581a5260e650ff03c2a27b918e9c046db578a393a219bc1181c619be88199ca15eec3cc8bd064b251914b7f1404"

RPROVIDES:${PN} += "config-monitoring-plugins-dhcp \
monitoring-plugins-dhcp \
nagios-plugins-dhcp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
