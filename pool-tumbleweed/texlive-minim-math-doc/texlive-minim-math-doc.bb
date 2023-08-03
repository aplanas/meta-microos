SUMMARY = "Documentation for texlive-minim-math"
DESCRIPTION = "This package includes the documentation for texlive-minim-math"
LICENSE = "LPPL-1.0"

PV = "2023.209.2023_1.2svn66395"

RPM_NAME = "texlive-minim-math-doc-2023.209.2023_1.2svn66395-55.1.noarch.rpm"
RPM_HASH = "c19dd13caf39769db41ea6a5188fbde68a823d1b4151c78771e00c03743a912c6bddeea6d4d6099160bb6ca6a1db84b650ddb881e0c037248d03501cf519fc1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minim-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
