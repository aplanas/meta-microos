SUMMARY = "Documentation for texlive-elements"
DESCRIPTION = "This package includes the documentation for texlive-elements"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn61792"

RPM_NAME = "texlive-elements-doc-2023.209.0.0.4svn61792-54.1.noarch.rpm"
RPM_HASH = "23cc07ef0f7b60fe4e00df14ec40e223d017884b76ca50cab797b625c514485bfd3defc7d0d58f842e26537787bc3df92799006ae43fa0840575edf3dab26fb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elements-doc"

RDEPENDS:${PN} += ""

inherit rpm
