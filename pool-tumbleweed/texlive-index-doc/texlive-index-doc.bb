SUMMARY = "Documentation for texlive-index"
DESCRIPTION = "This package includes the documentation for texlive-index"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.1betasvn24099"

RPM_NAME = "texlive-index-doc-2023.209.4.1betasvn24099-54.1.noarch.rpm"
RPM_HASH = "82d04162140f63cd48281a0be7dd8711b130f334bb251a479c63dea5ef50d43299ed6b8586c1139d3343dacf2cdba51303cd5dfed9ee96e6d5655c59c725d8b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-index-doc"

RDEPENDS:${PN} += ""

inherit rpm
