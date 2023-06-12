SUMMARY = "Documentation for texlive-datetime2-romanian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-romanian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn56394"

RPM_NAME = "texlive-datetime2-romanian-doc-2023.201.1.02svn56394-52.1.noarch.rpm"
RPM_HASH = "e46edebbe4b45c3eefd5da52627b25a42d1e971abc859147b7e1e1dd3e626163ad662a4ef2d3443296c5f2ed6903ccbeb4c146ad0308695d5106e7e8a8e5dce0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-romanian-doc"
RDEPENDS:${PN} += ""

inherit rpm
