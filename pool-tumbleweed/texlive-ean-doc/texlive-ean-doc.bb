SUMMARY = "Documentation for texlive-ean"
DESCRIPTION = "This package includes the documentation for texlive-ean"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn20851"

RPM_NAME = "texlive-ean-doc-2023.201.svn20851-53.1.noarch.rpm"
RPM_HASH = "b53c9914d18f7cca1354828aa7d89e09f46352ece7e2a0f4707a33b672458e94cbde72715f50f7f2c08224a2b238634adf43877f47678601649ae88d812f4b57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ean-doc"

RDEPENDS:${PN} += ""

inherit rpm
