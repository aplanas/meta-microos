SUMMARY = "Documentation for texlive-rsfso"
DESCRIPTION = "This package includes the documentation for texlive-rsfso"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn60849"

RPM_NAME = "texlive-rsfso-doc-2023.209.1.03svn60849-54.1.noarch.rpm"
RPM_HASH = "9181c023e50e8ff9c091de70d0e4cff592eb949dddce402666afdd4e75ddbf61308ca2143c23efb6aa4c8c2fecddab28e09c76cd84704baa40ccc7c52246847d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rsfso-doc"

RDEPENDS:${PN} += ""

inherit rpm
