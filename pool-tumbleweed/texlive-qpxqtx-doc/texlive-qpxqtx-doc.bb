SUMMARY = "Documentation for texlive-qpxqtx"
DESCRIPTION = "This package includes the documentation for texlive-qpxqtx"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45797"

RPM_NAME = "texlive-qpxqtx-doc-2023.209.svn45797-54.1.noarch.rpm"
RPM_HASH = "9e7fb60a68e7e5f7d32700b0b32c2d5b19d62666317cad166a5c82dd528c179ce80ad8c83686a379abefed9b82c062a551460dbc1e574a186fa96d2a922a38ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qpxqtx-doc"

RDEPENDS:${PN} += ""

inherit rpm
