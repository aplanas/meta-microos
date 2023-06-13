SUMMARY = "Documentation for texlive-checkend"
DESCRIPTION = "This package includes the documentation for texlive-checkend"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn51475"

RPM_NAME = "texlive-checkend-doc-2023.201.1.0svn51475-53.1.noarch.rpm"
RPM_HASH = "e56ff33ef84d3d33a44543acacfb9d8b48b1ecdb7ded5b3e7bfe99f8571dbcad728592a2e49251ebacf0fa892f66500ae86c593c5178851586c749e6ab611195"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-checkend-doc"

RDEPENDS:${PN} += ""

inherit rpm
