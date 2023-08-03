SUMMARY = "Documentation for texlive-acmart"
DESCRIPTION = "This package includes the documentation for texlive-acmart"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.88svn64967"

RPM_NAME = "texlive-acmart-doc-2023.209.1.88svn64967-55.1.noarch.rpm"
RPM_HASH = "7d7349c50af8a2a9ff9533e2f393638bb9cf896a45ec8a190c6942d25a2a4df200af53a1d8a303dbcc40312f6c73456040e77450c0c39cd3a26a836248ae8d32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-acmart-doc"

RDEPENDS:${PN} += ""

inherit rpm
