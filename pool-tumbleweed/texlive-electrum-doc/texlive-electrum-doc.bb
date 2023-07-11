SUMMARY = "Documentation for texlive-electrum"
DESCRIPTION = "This package includes the documentation for texlive-electrum"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.005_bsvn19705"

RPM_NAME = "texlive-electrum-doc-2023.201.1.005_bsvn19705-53.2.noarch.rpm"
RPM_HASH = "0ecd26617815579141d24d4e54494e4edf82db27a5bc51a36b17606e170d499f6070d181f08aa22c6bfc6999a03799d1faf6aac13406a23689d241905099ba9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-electrum-doc"

RDEPENDS:${PN} += ""

inherit rpm
