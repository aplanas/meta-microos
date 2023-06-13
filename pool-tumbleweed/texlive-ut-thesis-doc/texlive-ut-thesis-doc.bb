SUMMARY = "Documentation for texlive-ut-thesis"
DESCRIPTION = "This package includes the documentation for texlive-ut-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1.7svn65767"

RPM_NAME = "texlive-ut-thesis-doc-2023.201.3.1.7svn65767-53.1.noarch.rpm"
RPM_HASH = "60dd03b2d70b71345f154f8c1f545b6b07f08c4acd48bcf1af4c369ede8237a12e0c64d08b29058a21da20fcefe2db5e1063db712f7410f4e779c852c45e0540"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ut-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
