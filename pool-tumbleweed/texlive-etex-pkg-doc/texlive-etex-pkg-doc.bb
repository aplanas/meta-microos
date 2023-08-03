SUMMARY = "Documentation for texlive-etex-pkg"
DESCRIPTION = "This package includes the documentation for texlive-etex-pkg"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn41784"

RPM_NAME = "texlive-etex-pkg-doc-2023.209.2.7svn41784-53.1.noarch.rpm"
RPM_HASH = "6764849470c1a1701bc47360b06bd7fa951aa5de5e52287bd72535ea0245e29cb043c8cddef7b9446c94ffadbebfd9e135c49d58f8b1dcd9de72308b5dceef7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etex-pkg-doc"

RDEPENDS:${PN} += ""

inherit rpm
