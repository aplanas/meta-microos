SUMMARY = "Documentation for texlive-listliketab"
DESCRIPTION = "This package includes the documentation for texlive-listliketab"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-listliketab-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "741e1c3d7550ad33ee7dd403d23a66aee9b0f41033183774d67ceff33fc900e07dc5788eeebf9481b00d7dd93f65721e3102b17f4ffa0435f5ae4120ff46b7b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-listliketab-doc"

RDEPENDS:${PN} += ""

inherit rpm
