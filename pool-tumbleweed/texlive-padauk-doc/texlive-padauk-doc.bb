SUMMARY = "Documentation for texlive-padauk"
DESCRIPTION = "This package includes the documentation for texlive-padauk"
LICENSE = "OFL-1.1"

PV = "2023.201.3.002svn42617"

RPM_NAME = "texlive-padauk-doc-2023.201.3.002svn42617-51.1.noarch.rpm"
RPM_HASH = "21c275cc2288b5d691e8714086aadcda2384aff1af2a7f44e6b86891e78ba59466edd53519414f7287ae035e338df4eb9dd2dc1034f551293833370487b6ed3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-padauk-doc"

RDEPENDS:${PN} += ""

inherit rpm
