SUMMARY = "Libprelude documentation"
DESCRIPTION = "Libprelude documentation files."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "libprelude-doc-5.2.0-2.16.aarch64.rpm"
RPM_HASH = "43663ae3ef7fe0015c7e8d4405e42ff4fde825f3bdfee2a79a44ce94d7f095503af2a207b405ddd3941cbd4cf37f0d4d6243ccce246ce37a783986145776ac88"

RPROVIDES:${PN} += "libprelude-doc"

RDEPENDS:${PN} += ""

inherit rpm
