SUMMARY = "Documentation for texlive-chemsec"
DESCRIPTION = "This package includes the documentation for texlive-chemsec"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.12asvn46972"

RPM_NAME = "texlive-chemsec-doc-2023.209.1.12asvn46972-54.1.noarch.rpm"
RPM_HASH = "94a7fd8ee4855fe88e714726aa18cdc5d5078363cca459abacced7b4c36c34ffc46e36f364ecbe57d0c5f5f5253cc095aff17f014513d4466bf512fcf91addca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemsec-doc"

RDEPENDS:${PN} += ""

inherit rpm
