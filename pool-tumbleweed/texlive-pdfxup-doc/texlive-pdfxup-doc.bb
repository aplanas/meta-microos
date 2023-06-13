SUMMARY = "Documentation for texlive-pdfxup"
DESCRIPTION = "This package includes the documentation for texlive-pdfxup"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.10svn59001"

RPM_NAME = "texlive-pdfxup-doc-2023.201.2.10svn59001-51.1.noarch.rpm"
RPM_HASH = "efb69c83afb960873ee953c35835b47c727c7fbf7547733b4926da53277b5d6c51ed9119c7132c57ce7a9f78aad5c468b924f9cb7bce742c8a952b46b5941ece"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(pdfxup.1) \
texlive-pdfxup-doc"

RDEPENDS:${PN} += ""

inherit rpm
