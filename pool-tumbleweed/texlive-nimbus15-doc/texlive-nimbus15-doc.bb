SUMMARY = "Documentation for texlive-nimbus15"
DESCRIPTION = "This package includes the documentation for texlive-nimbus15"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.014svn58839"

RPM_NAME = "texlive-nimbus15-doc-2023.201.1.014svn58839-54.1.noarch.rpm"
RPM_HASH = "3d39388299a8afca43ecf763c44a076b3d57cf58a8b0cc89d1e3fb599b2ea5450a5d489a6d59fb3db3804879f53999e792a63fd6ece9836a452c797fa4dc3fd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nimbus15-doc"

RDEPENDS:${PN} += ""

inherit rpm
