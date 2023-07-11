SUMMARY = "Documentation for texlive-qtree"
DESCRIPTION = "This package includes the documentation for texlive-qtree"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1bsvn15878"

RPM_NAME = "texlive-qtree-doc-2023.201.3.1bsvn15878-53.2.noarch.rpm"
RPM_HASH = "a98711e0901c07005e236b5839b61c69dc4c7ed509ce6b931abe9305567e5cd95beabeeaa3568f23bb938baf28a636e1cdaa6870d9bd0dad79ca2715860425f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-qtree-doc-en \
texlive-qtree-doc"

RDEPENDS:${PN} += ""

inherit rpm
