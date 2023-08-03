SUMMARY = "Linux Studio Plugins Documentation"
DESCRIPTION = "Documentation for Linux Studio Plugins Project"
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.8"

RPM_NAME = "lsp-plugins-doc-1.2.8-1.1.noarch.rpm"
RPM_HASH = "25f77be9f81630b9e15689885863eff9e1e207cb11578d6ffd76e15f4783d4637e1995bf99646940ab70800972ec16686a160acc077e7afd474c928b75f0cf5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lsp-plugins-doc"

RDEPENDS:${PN} += ""

inherit rpm
