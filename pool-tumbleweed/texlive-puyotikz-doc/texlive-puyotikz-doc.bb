SUMMARY = "Documentation for texlive-puyotikz"
DESCRIPTION = "This package includes the documentation for texlive-puyotikz"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn57254"

RPM_NAME = "texlive-puyotikz-doc-2023.201.1.0.1svn57254-53.2.noarch.rpm"
RPM_HASH = "3c3007bb787db9049b2dd027b7a6377b2e342b014b9dcb7e9688a04150cd7d3a75a3efe5c5703a03e7defa8c5ff608ec90648fabe8ece2bbda29c723f00294a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-puyotikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
