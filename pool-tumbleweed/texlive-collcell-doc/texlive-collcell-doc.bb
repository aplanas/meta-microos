SUMMARY = "Documentation for texlive-collcell"
DESCRIPTION = "This package includes the documentation for texlive-collcell"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn64967"

RPM_NAME = "texlive-collcell-doc-2023.209.0.0.5svn64967-54.1.noarch.rpm"
RPM_HASH = "84745165f97fde98c5aea97179fc2a156f58a04bb5141fbf4b7ec6fb84410e81d6a47ca08c37058732159d3878db922d2d3a1d3be62390e865e7053c329f6477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collcell-doc"

RDEPENDS:${PN} += ""

inherit rpm
