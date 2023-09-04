SUMMARY = "Documentation for texlive-ieeepes"
DESCRIPTION = "This package includes the documentation for texlive-ieeepes"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.0svn17359"

RPM_NAME = "texlive-ieeepes-doc-2023.209.4.0svn17359-54.1.noarch.rpm"
RPM_HASH = "97d2d2d52172cb5207062880f98d5e64bd209f374dd0767af86260f38fa180586ed2775a635585e978909fb9f86ada1ef2282b70ad176320fb2f574f087048f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ieeepes-doc"

RDEPENDS:${PN} += ""

inherit rpm
