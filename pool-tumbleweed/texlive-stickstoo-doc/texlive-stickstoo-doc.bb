SUMMARY = "Documentation for texlive-stickstoo"
DESCRIPTION = "This package includes the documentation for texlive-stickstoo"
LICENSE = "OFL-1.1"

PV = "2023.201.1.035svn60793"

RPM_NAME = "texlive-stickstoo-doc-2023.201.1.035svn60793-57.1.noarch.rpm"
RPM_HASH = "89bd4b2f43953803133f648663791e0d4b55526daab54dc185bc3ce3f1925a37297dfb2c7971d526d5b06036c497aa92881e8c2a833dd15a3e3e8d27d8245f1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stickstoo-doc"

RDEPENDS:${PN} += ""

inherit rpm
