SUMMARY = "SNMP traps plugin for Prelude Manager"
DESCRIPTION = "This plugin adds SNMP traps capabilities to prelude-manager"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "prelude-manager-snmp-plugin-5.2.0-2.10.aarch64.rpm"
RPM_HASH = "7b92c8207a025db847a44c870248a41e2e6117d6260b58642480f2210e8c60979d2436df338badd609b85df5236313e628d7833974c58737fc7827e31bfffe0e"

RPROVIDES:${PN} += "prelude-manager-snmp-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.40 \
prelude-manager"

inherit rpm
