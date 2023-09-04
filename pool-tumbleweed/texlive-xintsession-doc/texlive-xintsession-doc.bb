SUMMARY = "Documentation for texlive-xintsession"
DESCRIPTION = "This package includes the documentation for texlive-xintsession"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4alphasvn60926"

RPM_NAME = "texlive-xintsession-doc-2023.209.0.0.4alphasvn60926-53.2.noarch.rpm"
RPM_HASH = "e3e5ad68387d10c18f6586e89abdb2b041abcc67f19ecc38c4de336a05f2e64e1445ca4b3c7ec7bfd3cd23edfc0111be7361a956b7cae74822bc80f5875bd1bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xintsession-doc"

RDEPENDS:${PN} += ""

inherit rpm
