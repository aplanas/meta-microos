SUMMARY = "Documentation for texlive-papertex"
DESCRIPTION = "This package includes the documentation for texlive-papertex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2bsvn19230"

RPM_NAME = "texlive-papertex-doc-2023.201.1.2bsvn19230-51.1.noarch.rpm"
RPM_HASH = "980c2b7f75761900fd0ba4df2ca3dc756622b97c034ce8199b70f0fac2a42d62c9178b9e16600cbd0e92107571c1957a91286fe70daa827509e94ea8e132c081"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-papertex-doc"

RDEPENDS:${PN} += ""

inherit rpm
