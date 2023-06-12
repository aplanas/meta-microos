SUMMARY = "Documentation for texlive-punk"
DESCRIPTION = "This package includes the documentation for texlive-punk"
LICENSE = "SUSE-TeX"

PV = "2023.201.svn27388"

RPM_NAME = "texlive-punk-doc-2023.201.svn27388-53.1.noarch.rpm"
RPM_HASH = "3b1835b6addbf201b490632bf4096b5538c5b6042d5b1aabddcef6738cf7953f2674f3335300bf7528e45a641de16bfcf62c58117e6779f56338a7b119f36dad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-punk-doc"
RDEPENDS:${PN} += ""

inherit rpm
