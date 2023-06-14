SUMMARY = "Documentation for texlive-thuaslogos"
DESCRIPTION = "This package includes the documentation for texlive-thuaslogos"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn51347"

RPM_NAME = "texlive-thuaslogos-doc-2023.201.1.2svn51347-54.1.noarch.rpm"
RPM_HASH = "c49c016e96234ce5c3589070a9c3a11016c8e25c2342be4f62ee13bc020c7761fdb222e133125647fb54c68e2e89b767621f03f1ffcc872de4444df90f38855c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-thuaslogos-doc-nl \
texlive-thuaslogos-doc"

RDEPENDS:${PN} += ""

inherit rpm
