SUMMARY = "Documentation for texlive-coloring"
DESCRIPTION = "This package includes the documentation for texlive-coloring"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn41042"

RPM_NAME = "texlive-coloring-doc-2023.201.0.0.2svn41042-53.1.noarch.rpm"
RPM_HASH = "5313766e21b309afe76ce74ca8481cc39a231dfd9d63030759fcb7f88df30771da86d85baca62602afd5114e5c639f904202b1442c0a16385d2b3a753f526c29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coloring-doc"

RDEPENDS:${PN} += ""

inherit rpm
