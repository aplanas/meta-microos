SUMMARY = "Documentation for texlive-inconsolata"
DESCRIPTION = "This package includes the documentation for texlive-inconsolata"
LICENSE = "OFL-1.1"

PV = "2023.208.1.121svn54512"

RPM_NAME = "texlive-inconsolata-doc-2023.208.1.121svn54512-53.1.noarch.rpm"
RPM_HASH = "627c962343d491c1f2cf54fdf8af722ac39b5d6fa71b9e47c9cd419c3207d48ed3c139c3dc6ba81cca1ed2a9a194677e879895fe73f37ac3a1020e24a896b9cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inconsolata-doc"

RDEPENDS:${PN} += ""

inherit rpm
