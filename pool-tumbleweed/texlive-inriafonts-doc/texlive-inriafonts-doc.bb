SUMMARY = "Documentation for texlive-inriafonts"
DESCRIPTION = "This package includes the documentation for texlive-inriafonts"
LICENSE = "OFL-1.1"

PV = "2023.208.1.0svn54512"

RPM_NAME = "texlive-inriafonts-doc-2023.208.1.0svn54512-53.1.noarch.rpm"
RPM_HASH = "128cfd97265313a299052879989d01ad673a912564821655eca5e2c1680f313882ae86816f7383a6a5a009da7a2c0fb73f475a9d8828744845c7b62b604d32f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inriafonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
