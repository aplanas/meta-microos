SUMMARY = "Documentation for texlive-engrec"
DESCRIPTION = "This package includes the documentation for texlive-engrec"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-engrec-doc-2023.201.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "3235280556324c327c89ef9513e1141a3c02d42be005800d816fbf96fa8ea09aa8a2259ac3328032102aa439be9c5244f32f9c1ac8aafae43e8d2d6b93aed7fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-engrec-doc"

RDEPENDS:${PN} += ""

inherit rpm
