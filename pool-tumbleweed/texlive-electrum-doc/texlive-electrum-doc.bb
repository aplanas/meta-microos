SUMMARY = "Documentation for texlive-electrum"
DESCRIPTION = "This package includes the documentation for texlive-electrum"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.005_bsvn19705"

RPM_NAME = "texlive-electrum-doc-2023.209.1.005_bsvn19705-54.1.noarch.rpm"
RPM_HASH = "618899a324099df6443541dcf136c99a5f397f23e5b4d3cb89c9b75f17209045c6365666c9f2671a06a652d37a9704302193c3a090cb71a67ff9ad4b4ae84c9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-electrum-doc"

RDEPENDS:${PN} += ""

inherit rpm
