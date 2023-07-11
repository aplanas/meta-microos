SUMMARY = "Collect data from NSClient service"
DESCRIPTION = "This plugin collects data from the NSClient service running on a \
Windows NT/2000/XP/2003 server."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-nt-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "ce1d54919e2c260c8399ceaad1d46a4dbba8bc8e3ad69aef84aa731d6fec8e0d82942a9f104e85b1259622a59cf3eb6aa23d29a07a1c023021afd19da1315c0e"

RPROVIDES:${PN} += "monitoring-plugins-nt \
nagios-plugins-nt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
