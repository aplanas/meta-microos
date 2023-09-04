SUMMARY = "Documentation for texlive-epigraph"
DESCRIPTION = "This package includes the documentation for texlive-epigraph"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5esvn54857"

RPM_NAME = "texlive-epigraph-doc-2023.209.1.5esvn54857-54.2.noarch.rpm"
RPM_HASH = "adba98e0f600bc7576b1c11fa82932b1b0c07c7a2215fb906db4a4ba72ebafae2f6984e5bb0ef773784071a87a947cbd9fbcb779cc8c5ccbcefd8933d1c10910"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epigraph-doc"

RDEPENDS:${PN} += ""

inherit rpm
