SUMMARY = "Documentation for texlive-drac"
DESCRIPTION = "This package includes the documentation for texlive-drac"
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn15878"

RPM_NAME = "texlive-drac-doc-2023.209.1svn15878-53.1.noarch.rpm"
RPM_HASH = "864aba41773b7ae463c4a04c0b5890d39ee0c85b26e5e34b93dc4195ac7a18901d186dd4c2c2aacc974ee565cb89d4effd01cc5b4ec6efe8f50e25f8ea5507c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-drac-doc-fr;en \
texlive-drac-doc"

RDEPENDS:${PN} += ""

inherit rpm
