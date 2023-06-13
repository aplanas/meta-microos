SUMMARY = "Documentation for texlive-pm-isomath"
DESCRIPTION = "This package includes the documentation for texlive-pm-isomath"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.00svn60368"

RPM_NAME = "texlive-pm-isomath-doc-2023.201.1.2.00svn60368-52.1.noarch.rpm"
RPM_HASH = "d27139bd4258881a6df8084171075c6261434c8057aa0c24c4f62d2dd1faa15c2fa556b5372cad597bb095d3e2bd419cb74f1f5de7fba28ef401100a91328306"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pm-isomath-doc"

RDEPENDS:${PN} += ""

inherit rpm
