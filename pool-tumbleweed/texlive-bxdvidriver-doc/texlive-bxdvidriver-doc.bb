SUMMARY = "Documentation for texlive-bxdvidriver"
DESCRIPTION = "This package includes the documentation for texlive-bxdvidriver"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2asvn43219"

RPM_NAME = "texlive-bxdvidriver-doc-2023.209.0.0.2asvn43219-53.1.noarch.rpm"
RPM_HASH = "37759950eabff7ce6eaa4350b45e6e29e66a98ca918628582b325c0aed7605136dc845e988f3340d9e8010b2898d00441f259dbcb122a2d8ee8e8c5e60e14566"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxdvidriver-doc"

RDEPENDS:${PN} += ""

inherit rpm
