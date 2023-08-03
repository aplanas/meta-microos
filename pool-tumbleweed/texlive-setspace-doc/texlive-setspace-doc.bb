SUMMARY = "Documentation for texlive-setspace"
DESCRIPTION = "This package includes the documentation for texlive-setspace"
LICENSE = "LPPL-1.0"

PV = "2023.209.6.7bsvn65206"

RPM_NAME = "texlive-setspace-doc-2023.209.6.7bsvn65206-54.1.noarch.rpm"
RPM_HASH = "07d1bda0359edcf62710097778c75f48f9fedf9ed9ddabbee91e7ebe010ee753962f1583cac4060da36e4dbdc8f4564e004ce7768e527b661796b55308db1a9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-setspace-doc"

RDEPENDS:${PN} += ""

inherit rpm
