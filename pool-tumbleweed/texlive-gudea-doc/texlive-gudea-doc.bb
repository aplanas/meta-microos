SUMMARY = "Documentation for texlive-gudea"
DESCRIPTION = "This package includes the documentation for texlive-gudea"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.0.1svn57359"

RPM_NAME = "texlive-gudea-doc-2023.201.0.0.0.1svn57359-53.2.noarch.rpm"
RPM_HASH = "ecd25ae8ae30a60bd561fa6c1b902433fb09166d9b28f562b224ff8d270440c05bbebec95a16ed11488044553aacb2a66a465aef89336722726834b0b4bd9034"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gudea-doc"

RDEPENDS:${PN} += ""

inherit rpm
