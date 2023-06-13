SUMMARY = "Documentation for texlive-pdfcprot"
DESCRIPTION = "This package includes the documentation for texlive-pdfcprot"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7asvn18735"

RPM_NAME = "texlive-pdfcprot-doc-2023.201.1.7asvn18735-51.1.noarch.rpm"
RPM_HASH = "f12b005d81727fde5f56de9f176c543592389b8672cbb5394f76503ecfb521af39e56155ea44c88a215a556fcfd0a35adc7b4ed87850826b0c9fac8bd452bbf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfcprot-doc"

RDEPENDS:${PN} += ""

inherit rpm
