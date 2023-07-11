SUMMARY = "Documentation for texlive-marvosym"
DESCRIPTION = "This package includes the documentation for texlive-marvosym"
LICENSE = "OFL-1.1"

PV = "2023.208.2.2asvn29349"

RPM_NAME = "texlive-marvosym-doc-2023.208.2.2asvn29349-53.1.noarch.rpm"
RPM_HASH = "964916e527fc7618744b75dfa3399650da1328f3ea1f078f6291c0615f77d4dc6a46c03329a7177ad626783f814af3f330ea053b2c6a48b85b30f393fa8b872a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-marvosym-doc"

RDEPENDS:${PN} += ""

inherit rpm
