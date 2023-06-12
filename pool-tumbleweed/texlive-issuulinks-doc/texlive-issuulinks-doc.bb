SUMMARY = "Documentation for texlive-issuulinks"
DESCRIPTION = "This package includes the documentation for texlive-issuulinks"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn25742"

RPM_NAME = "texlive-issuulinks-doc-2023.201.1.1svn25742-55.1.noarch.rpm"
RPM_HASH = "3ef87b148aa584e2fa035f4af06c3a8a618577a7c9ea237cd4747b745206ab93366159fa2dc5739899c13132bd806c1e6200358fa8a8f1008d8265b9db15201c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-issuulinks-doc"
RDEPENDS:${PN} += ""

inherit rpm
