SUMMARY = "Documentation for texlive-sttools"
DESCRIPTION = "This package includes the documentation for texlive-sttools"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn60736"

RPM_NAME = "texlive-sttools-doc-2023.201.3.0svn60736-57.1.noarch.rpm"
RPM_HASH = "320545643ccb9d120f1206a9d8385d9432b39b88c83373e1a0600944186cca3b21a39df6d0460ee321b008d150f41898d28c672991ba46b94fd83167b946bceb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sttools-doc"

RDEPENDS:${PN} += ""

inherit rpm
