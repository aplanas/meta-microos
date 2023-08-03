SUMMARY = "Documentation for texlive-fetamont"
DESCRIPTION = "This package includes the documentation for texlive-fetamont"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn43812"

RPM_NAME = "texlive-fetamont-doc-2023.209.svn43812-53.1.noarch.rpm"
RPM_HASH = "4e442940f1c82b49fb46b508ca075a2b6b3a738aeac543c00b541503bd496833a231aaed2bb4902ca5a618319037d127cbf2ca21aee226e9d815822244f4e5ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fetamont-doc"

RDEPENDS:${PN} += ""

inherit rpm
