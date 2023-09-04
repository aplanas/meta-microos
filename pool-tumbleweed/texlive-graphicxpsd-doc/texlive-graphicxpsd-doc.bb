SUMMARY = "Documentation for texlive-graphicxpsd"
DESCRIPTION = "This package includes the documentation for texlive-graphicxpsd"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn57341"

RPM_NAME = "texlive-graphicxpsd-doc-2023.209.1.2svn57341-54.2.noarch.rpm"
RPM_HASH = "af1338a9e453fbbf69ef93031076d309fe0e364c8ea8ffaee31b07db9cf79a9e7b0ede03d9ccffc37348a2dd0fe1344abd2e552c4bbf98e7ed663797eb81d1d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphicxpsd-doc"

RDEPENDS:${PN} += ""

inherit rpm
