SUMMARY = "Documentation for texlive-algorithmicx"
DESCRIPTION = "This package includes the documentation for texlive-algorithmicx"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-algorithmicx-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "27a80ac394cb10490b33ea2c279000bd63c6dc31f30caec0b5fe53e1d5f91aba76677aeccb85f711f83b2e8a658eeaa1508a888d6b1dd530e449bcb315509e8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-algorithmicx-doc"

RDEPENDS:${PN} += ""

inherit rpm
