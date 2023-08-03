SUMMARY = "Documentation for texlive-pdfcprot"
DESCRIPTION = "This package includes the documentation for texlive-pdfcprot"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7asvn18735"

RPM_NAME = "texlive-pdfcprot-doc-2023.209.1.7asvn18735-52.1.noarch.rpm"
RPM_HASH = "fa0d553eb0cbda3d1c47c267adaebf7efe2277737c94a4f7b6a6e849dcc5b601f966df224d53ef400617c9e3b2e871ad3a536f113c8bb2314073eaf62ff9764b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfcprot-doc"

RDEPENDS:${PN} += ""

inherit rpm
