SUMMARY = "Documentation for texlive-ptex-fonts"
DESCRIPTION = "This package includes the documentation for texlive-ptex-fonts"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn64330"

RPM_NAME = "texlive-ptex-fonts-doc-2023.209.svn64330-54.2.noarch.rpm"
RPM_HASH = "1c63e8d48714b5f83bb0fa5288dc2500202c882ecbff67f450c01843a4bc5d86e4017270da54bc46abc00dbd0b7083fa414dc41c58fde0606467318f3567b8fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
