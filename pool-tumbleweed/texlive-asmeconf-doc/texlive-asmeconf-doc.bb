SUMMARY = "Documentation for texlive-asmeconf"
DESCRIPTION = "This package includes the documentation for texlive-asmeconf"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.34svn65413"

RPM_NAME = "texlive-asmeconf-doc-2023.209.1.34svn65413-54.1.noarch.rpm"
RPM_HASH = "80dd1d47b8c2ffc30eff3143457251e5880a9d2d6a16dd1e9dfcd6d341121719d777e5425c86d6882c153ae49992854237c0ae19e583e10139bb9a9e7022bd45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asmeconf-doc"

RDEPENDS:${PN} += ""

inherit rpm
