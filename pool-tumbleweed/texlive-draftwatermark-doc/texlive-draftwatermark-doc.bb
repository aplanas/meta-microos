SUMMARY = "Documentation for texlive-draftwatermark"
DESCRIPTION = "This package includes the documentation for texlive-draftwatermark"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn57099"

RPM_NAME = "texlive-draftwatermark-doc-2023.201.3.0svn57099-52.1.noarch.rpm"
RPM_HASH = "3b1d206aa2d54b3548697394f384d9d3fc0c9cf5ac66d61cbf7b1131ba9c6b8295849905e2fe7dd4c917ea8286bfae3ef88c88b718e0c45913fff88fbe370b6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-draftwatermark-doc"

RDEPENDS:${PN} += ""

inherit rpm
