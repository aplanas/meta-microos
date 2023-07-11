SUMMARY = "Documentation for libdbusmenu-glib4"
DESCRIPTION = "This package includes the documentation for the dbusmenu-glib library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-glib-doc-16.04.0-9.4.noarch.rpm"
RPM_HASH = "a44774fa5daa18b34a508d18c312e81fea4a71a7630a60698cc4a1af42b8c1f5b922841baf797fa751188a85876bfa833671ae8175203a31f31259dbc71daa53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdbusmenu-glib-doc"

RDEPENDS:${PN} += ""

inherit rpm
