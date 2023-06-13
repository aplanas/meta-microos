SUMMARY = "Documentation for texlive-bxghost"
DESCRIPTION = "This package includes the documentation for texlive-bxghost"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5.1svn66147"

RPM_NAME = "texlive-bxghost-doc-2023.201.0.0.5.1svn66147-52.1.noarch.rpm"
RPM_HASH = "169473bc9b118a76da8544bb9cc33f25fb95fa50ea94304b13050869bcd1d6b3f6bf0656a454789ff9d3a0b4ffa672d5d2b5954df3d7ca3e38756384c68479a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxghost-doc"

RDEPENDS:${PN} += ""

inherit rpm
