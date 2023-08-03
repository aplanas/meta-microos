SUMMARY = "Documentation for texlive-frederika2016"
DESCRIPTION = "This package includes the documentation for texlive-frederika2016"
LICENSE = "OFL-1.1"

PV = "2023.209.1.000_2016_initial_releasesvn42157"

RPM_NAME = "texlive-frederika2016-doc-2023.209.1.000_2016_initial_releasesvn42157-53.1.noarch.rpm"
RPM_HASH = "10008c57570dec8f8ec5005c82441ea24f22fc84959ae0381ded1ad71666de0abe415d84e6435f7289c453f27a0e893f6d32fb08b6c3de17bc468217d33a46a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frederika2016-doc"

RDEPENDS:${PN} += ""

inherit rpm
