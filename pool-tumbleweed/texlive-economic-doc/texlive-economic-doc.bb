SUMMARY = "Documentation for texlive-economic"
DESCRIPTION = "This package includes the documentation for texlive-economic"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn32639"

RPM_NAME = "texlive-economic-doc-2023.201.svn32639-53.2.noarch.rpm"
RPM_HASH = "16ba55c962f48da81439ef5733577f7662894908a37a608e840712da9ac305c027f205c2e73b6858ebcbce989a18a44a99552775fc8249ecc2659117003be4be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-economic-doc"

RDEPENDS:${PN} += ""

inherit rpm
