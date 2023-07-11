SUMMARY = "Documentation for texlive-xecyrmongolian"
DESCRIPTION = "This package includes the documentation for texlive-xecyrmongolian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn53160"

RPM_NAME = "texlive-xecyrmongolian-doc-2023.201.1.0svn53160-52.2.noarch.rpm"
RPM_HASH = "8a5fbe6f35220e88766392f68aca34f99f38d75939f2cf042c0c6133fe8678bf65f23544bd654e1b5eacc6098b5a79478245d3d2569c96f94ccb586f04900112"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xecyrmongolian-doc"

RDEPENDS:${PN} += ""

inherit rpm
