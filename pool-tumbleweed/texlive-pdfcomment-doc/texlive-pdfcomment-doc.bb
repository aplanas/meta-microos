SUMMARY = "Documentation for texlive-pdfcomment"
DESCRIPTION = "This package includes the documentation for texlive-pdfcomment"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4asvn49047"

RPM_NAME = "texlive-pdfcomment-doc-2023.209.2.4asvn49047-52.1.noarch.rpm"
RPM_HASH = "5c0f325e4b59f46e369ade43b4f7d8663bdd9c4b4fb6249dffa0c3f807558b4514cc2972c6bb0bc94bf85497959a9f04e74adc82d28134cf68dbd11ad93a4c97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pdfcomment-doc-en;de \
texlive-pdfcomment-doc"

RDEPENDS:${PN} += ""

inherit rpm
