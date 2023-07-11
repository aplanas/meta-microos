SUMMARY = "Documentation for texlive-hypernat"
DESCRIPTION = "This package includes the documentation for texlive-hypernat"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.1.0bsvn17358"

RPM_NAME = "texlive-hypernat-doc-2023.208.1.0bsvn17358-53.1.noarch.rpm"
RPM_HASH = "bc9b1b9bf18cac0fe32098eb8206022cb6d0ca597b4b57d5b5a826c7f251d3730b3a5ef260f4ac36dbfa77ac7657d48140d8694240118d6b16a07646e29cebc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hypernat-doc"

RDEPENDS:${PN} += ""

inherit rpm
