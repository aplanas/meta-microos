SUMMARY = "Documentation for texlive-mptopdf"
DESCRIPTION = "This package includes the documentation for texlive-mptopdf"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65952"

RPM_NAME = "texlive-mptopdf-doc-2023.209.svn65952-55.1.noarch.rpm"
RPM_HASH = "016bab5582e4070c7a02c5ef612890c6491bb0700b79729ecdb0889000b19921a7e25c89f8fba276e8ad24e50106273c78d4dc89d280abf17c54d6c3be3c07bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-mptopdf.1 \
texlive-mptopdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
