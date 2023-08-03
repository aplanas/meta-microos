SUMMARY = "Documentation for texlive-cabin"
DESCRIPTION = "This package includes the documentation for texlive-cabin"
LICENSE = "OFL-1.1"

PV = "2023.209.svn65358"

RPM_NAME = "texlive-cabin-doc-2023.209.svn65358-53.1.noarch.rpm"
RPM_HASH = "275ee378f023a011485e5a56913f59d0c1e354d380355db90bb050d388bf045106950328a751da1fff30d97e83e3d09c0866a2bd7505ad579453853d3db2001f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cabin-doc"

RDEPENDS:${PN} += ""

inherit rpm
