SUMMARY = "Documentation for texlive-schwalbe-chess"
DESCRIPTION = "This package includes the documentation for texlive-schwalbe-chess"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.12svn63708"

RPM_NAME = "texlive-schwalbe-chess-doc-2023.209.2.12svn63708-54.1.noarch.rpm"
RPM_HASH = "712a25e7ca25867710362edd2f3c876b2cf48a2a21b6fc364bfea81dfe36cd90179b65a7d6e091b95443242f68c55d47042462330e0c27b5ed6f519c410e37d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-schwalbe-chess-doc-de \
texlive-schwalbe-chess-doc"

RDEPENDS:${PN} += ""

inherit rpm
