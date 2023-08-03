SUMMARY = "Documentation for texlive-savetrees"
DESCRIPTION = "This package includes the documentation for texlive-savetrees"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4svn40525"

RPM_NAME = "texlive-savetrees-doc-2023.209.2.4svn40525-54.1.noarch.rpm"
RPM_HASH = "d5778ddae44d045a0d32248b6d9b2afee0424ae3c081b196797aec83d872bb7d4c33096ccbd153013ebdd78be4894f15f87de73b088a7d95be638c04e4bb18e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-savetrees-doc"

RDEPENDS:${PN} += ""

inherit rpm
