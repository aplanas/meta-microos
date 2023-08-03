SUMMARY = "Documentation for texlive-splines"
DESCRIPTION = "This package includes the documentation for texlive-splines"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-splines-doc-2023.209.0.0.2svn15878-58.1.noarch.rpm"
RPM_HASH = "56e1375871d6109b384b067d2be4e5bd664ed7846b1af720b6bd65d1c2c10c4bd470bd1cc0d1fe5669a9e0cb2c6b91fc3d263538012159f492976893be4df06b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-splines-doc"

RDEPENDS:${PN} += ""

inherit rpm
