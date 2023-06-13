SUMMARY = "Developer documentation for udisks2"
DESCRIPTION = "This package contains developer documentation for udisks2."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "2.9.4"

RPM_NAME = "udisks2-docs-2.9.4-6.3.noarch.rpm"
RPM_HASH = "ecbac66d3966342e5c517e4ebb54c4f15486f4df33cf55badb83a1eda26bd363940adfdcb9c05f7d26146b5445c16d6e434f3d87225278a343b02a5616b91c2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "udisks2-docs"

RDEPENDS:${PN} += ""

inherit rpm
