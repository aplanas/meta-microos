SUMMARY = "Documentation for texlive-natbib"
DESCRIPTION = "This package includes the documentation for texlive-natbib"
LICENSE = "LPPL-1.0"

PV = "2023.201.8.31bsvn20668"

RPM_NAME = "texlive-natbib-doc-2023.201.8.31bsvn20668-54.1.noarch.rpm"
RPM_HASH = "85a8c7ae5afe7c09df61c6c3ec924b920c8905a6639f189ebed36d854a415b3160a42baa6f0ec9d2ec876fec8c52d67a1f44e80d26d7e490879cecbc4f0d22ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-natbib-doc:en) \
texlive-natbib-doc"

RDEPENDS:${PN} += ""

inherit rpm
