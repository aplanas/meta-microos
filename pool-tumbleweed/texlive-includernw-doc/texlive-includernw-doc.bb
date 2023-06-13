SUMMARY = "Documentation for texlive-includernw"
DESCRIPTION = "This package includes the documentation for texlive-includernw"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.0svn47557"

RPM_NAME = "texlive-includernw-doc-2023.201.0.0.1.0svn47557-52.1.noarch.rpm"
RPM_HASH = "90b8a54cf4cd823c9691a365603deacf102c51d9fa7c4d3b8f40630335556f7284caef4fcf35176d952743df84c626f1587c40e1c2471e921a9e93b9449c2368"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-includernw-doc"

RDEPENDS:${PN} += ""

inherit rpm
