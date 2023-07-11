SUMMARY = "Documentation for texlive-media9"
DESCRIPTION = "This package includes the documentation for texlive-media9"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.25svn64047"

RPM_NAME = "texlive-media9-doc-2023.208.1.25svn64047-53.1.noarch.rpm"
RPM_HASH = "87bd76eddd7db1c438b6f83c9a344e24a14d7b41e29fd793618b4eac57a138359c143a3e7658fae46a9efdb88eae922fbb88c431000412efeea216f0d31d9dcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-media9-doc"

RDEPENDS:${PN} += ""

inherit rpm
