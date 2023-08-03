SUMMARY = "Documentation for texlive-splitindex"
DESCRIPTION = "This package includes the documentation for texlive-splitindex"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2csvn39766"

RPM_NAME = "texlive-splitindex-doc-2023.209.1.2csvn39766-58.1.noarch.rpm"
RPM_HASH = "219e3a14eb72382389e0e41e5b05140c9141aa65740f5e32c9d0db50ab5e6de14c2f609b7bc5e066215e79e7a899cd74787259b5cfed1f69e4b073ae51814368"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-splitindex.1 \
texlive-splitindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
