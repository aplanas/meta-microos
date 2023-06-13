SUMMARY = "Documentation for texlive-polynomial"
DESCRIPTION = "This package includes the documentation for texlive-polynomial"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-polynomial-doc-2023.201.1.0svn15878-52.1.noarch.rpm"
RPM_HASH = "c435328c96df0e51b975a0cb6c3e93f354b94f46dce69c1f8bb24279ed41f4d035225eb4a0eb4e5e96c9822939f7828078c96404027f750455d26c561abc23b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-polynomial-doc"

RDEPENDS:${PN} += ""

inherit rpm
