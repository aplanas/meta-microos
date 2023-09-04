SUMMARY = "Documentation for texlive-xyling"
DESCRIPTION = "This package includes the documentation for texlive-xyling"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-xyling-doc-2023.209.1.1svn15878-53.2.noarch.rpm"
RPM_HASH = "cab4f1f2d50649caa817a07234b800fb714911addbd05806f90801bd5caaacc8552388abc8f427f30a6b5aab88c46feec456111db5ed1a9c5a2be8cccc33a461"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xyling-doc-en \
texlive-xyling-doc"

RDEPENDS:${PN} += ""

inherit rpm
