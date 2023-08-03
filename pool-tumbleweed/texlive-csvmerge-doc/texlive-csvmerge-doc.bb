SUMMARY = "Documentation for texlive-csvmerge"
DESCRIPTION = "This package includes the documentation for texlive-csvmerge"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn51857"

RPM_NAME = "texlive-csvmerge-doc-2023.209.1.0svn51857-55.1.noarch.rpm"
RPM_HASH = "4a03ca05bf7de6eaff3dec81f2a3680a67370afce7772dc4ee2e7ecf85d90d387fb0f0bf4e615abee5785f9a4ad84fbc94c8fd02788a6cd7dbf89dbc36431ae6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-csvmerge-doc"

RDEPENDS:${PN} += ""

inherit rpm
