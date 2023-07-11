SUMMARY = "Documentation for texlive-maze"
DESCRIPTION = "This package includes the documentation for texlive-maze"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2svn65508"

RPM_NAME = "texlive-maze-doc-2023.208.1.2svn65508-53.1.noarch.rpm"
RPM_HASH = "f351b4c326731f88eef0745c2b93b69f3a7f741d4df64a2682c5d263b2be342bb3ed246660099f435abdd3bf5f7ee529beed6fc7a223a94eab2c27447a423741"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-maze-doc"

RDEPENDS:${PN} += ""

inherit rpm
