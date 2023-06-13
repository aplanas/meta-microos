SUMMARY = "Documentation for texlive-play"
DESCRIPTION = "This package includes the documentation for texlive-play"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-play-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "3faeb4e0c357fed3449dc02b78730f511553127d3dfc7b44ef3bc746a528573f0702caf22acd9a6cf563d2ff90612c759aa2910905402785eaf399056ff16eef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-play-doc"

RDEPENDS:${PN} += ""

inherit rpm
