SUMMARY = "Documentation for texlive-listofitems"
DESCRIPTION = "This package includes the documentation for texlive-listofitems"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.63svn51923"

RPM_NAME = "texlive-listofitems-doc-2023.209.1.63svn51923-55.1.noarch.rpm"
RPM_HASH = "e67b43756a2e6805fe8b1a20fb7f5c800e62ee249dcc10b1410b4ff08c2327c63de7d5e776666cbcfe726a68b96fbb0e33df3b2d67b8d70a1754afa5f406a77b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-listofitems-doc-en;fr \
texlive-listofitems-doc"

RDEPENDS:${PN} += ""

inherit rpm
