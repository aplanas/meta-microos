SUMMARY = "Documentation for texlive-scalebar"
DESCRIPTION = "This package includes the documentation for texlive-scalebar"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-scalebar-doc-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "19bedfe0a1e6515cbc6ccfb04f2c8294a7679118e7815d8b4189024fe2aa5890cb2c0ab4650cbdb16e342278cd7eec15d9269bc3a7fa1e0590d0019c067fc1b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scalebar-doc"

RDEPENDS:${PN} += ""

inherit rpm
