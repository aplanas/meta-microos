SUMMARY = "Test DNS service via dig"
DESCRIPTION = "This plugin test the DNS service on the specified host using dig."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-dig-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "30979f6f74073015eea682d6fc7f4045163fbe828ee3e28e208c293dffb04d6d3c399128ba59de743d34c33ea246c107406c92486e58d1ad02351a55de282955"

RPROVIDES:${PN} += "monitoring-plugins-dig \
monitoring-plugins-dig(aarch-64) \
nagios-plugins-dig"

RDEPENDS:${PN} += "/usr/bin/dig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
