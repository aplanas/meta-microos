SUMMARY = "Documentation for the GNU Astromomy Utilities"
DESCRIPTION = "Additional documentation for the GNU Astromomy Utilities."
LICENSE = "GPL-3.0-or-later"

PV = "0.19"

RPM_NAME = "gnuastro-doc-0.19-1.11.noarch.rpm"
RPM_HASH = "c9822f710948ad851c891f3b7edf98edeb07433c59d640684c9c479492fea9eed599934e9e6642141d1a62542acac09e9cfe5f788118ea8bc89b65f12f840ee6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuastro-doc"

RDEPENDS:${PN} += ""

inherit rpm
