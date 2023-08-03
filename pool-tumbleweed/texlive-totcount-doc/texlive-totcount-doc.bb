SUMMARY = "Documentation for texlive-totcount"
DESCRIPTION = "This package includes the documentation for texlive-totcount"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn21178"

RPM_NAME = "texlive-totcount-doc-2023.209.1.2svn21178-53.1.noarch.rpm"
RPM_HASH = "7d0946a620db83991d3383232c3734586019486bfa82950dd238bd60d42c5eca033a98e1f10bb14ca3e3f744b649cba8bb23844e6d13aff2e1c1c6de5455545a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-totcount-doc"

RDEPENDS:${PN} += ""

inherit rpm
