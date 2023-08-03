SUMMARY = "Documentation for texlive-chessboard"
DESCRIPTION = "This package includes the documentation for texlive-chessboard"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9svn56833"

RPM_NAME = "texlive-chessboard-doc-2023.209.1.9svn56833-54.1.noarch.rpm"
RPM_HASH = "f8bee271b553cdf33e2fbd0f1ab55b699a04b0218bc51389cda2079fb410cc223daf63e502dd1dc2c6dd34cc22044998306bfb25f2b1e7b86613c66bd038a0bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chessboard-doc"

RDEPENDS:${PN} += ""

inherit rpm
