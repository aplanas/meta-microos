SUMMARY = "SNMP traps plugin for Prelude Manager"
DESCRIPTION = "This plugin adds SNMP traps capabilities to prelude-manager"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "prelude-manager-snmp-plugin-5.2.0-2.11.aarch64.rpm"
RPM_HASH = "d9b7494c4c17b916961b234a51043ab6d7839e6c2ce0377a32c5a28f1162e86e4a006798c91caab95b5f4120eb051510231b6d7380ff535d68d30046b2bbfffd"

RPROVIDES:${PN} += "prelude-manager-snmp-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.40 \
prelude-manager"

inherit rpm
