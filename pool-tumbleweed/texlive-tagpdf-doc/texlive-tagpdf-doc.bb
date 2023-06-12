SUMMARY = "Documentation for texlive-tagpdf"
DESCRIPTION = "This package includes the documentation for texlive-tagpdf"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.98esvn66461"

RPM_NAME = "texlive-tagpdf-doc-2023.201.0.0.98esvn66461-54.1.noarch.rpm"
RPM_HASH = "d5e51b644ff22fa78e68465b731145cc213c6be909e90b978fe2d1c6759a8c78f0733b7e6f65846aa615e55ba5791d0707510e0f06f449c681f719b473df17b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tagpdf-doc"
RDEPENDS:${PN} += ""

inherit rpm
