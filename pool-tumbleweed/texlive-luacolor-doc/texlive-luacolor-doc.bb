SUMMARY = "Documentation for texlive-luacolor"
DESCRIPTION = "This package includes the documentation for texlive-luacolor"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.17svn57829"

RPM_NAME = "texlive-luacolor-doc-2023.201.1.17svn57829-52.1.noarch.rpm"
RPM_HASH = "4c32896435034e38a46707a50bdada421847c3f40144bc84004ba63ec1e2dd72b3bd9ed09c4c01428c1d469f1fc3853d02bbdf723d0e82def19cc7675da92b12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luacolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
