SUMMARY = "Documentation for texlive-stackengine"
DESCRIPTION = "This package includes the documentation for texlive-stackengine"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.11svn60019"

RPM_NAME = "texlive-stackengine-doc-2023.209.4.11svn60019-58.1.noarch.rpm"
RPM_HASH = "8c301a3ccd76809b25c2f63c8947a8fcaad480d85c1d6329c2bb4334f02e7e004f3f405c9a5e716a6d3690e0843acd155df60e136650508d5c31c46658f650fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stackengine-doc"

RDEPENDS:${PN} += ""

inherit rpm
