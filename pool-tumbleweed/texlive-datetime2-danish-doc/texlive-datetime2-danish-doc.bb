SUMMARY = "Documentation for texlive-datetime2-danish"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-danish"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47034"

RPM_NAME = "texlive-datetime2-danish-doc-2023.201.1.1svn47034-52.1.noarch.rpm"
RPM_HASH = "d5765bcab8264923ef73c2e1ce28e2fba2e1a105d73ecd391382176e9cc33a7ca2a2641d8bf1ad7589a16a284ee40e9520710c2bc5e57d38d1695613cc92bdc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-danish-doc"

RDEPENDS:${PN} += ""

inherit rpm
