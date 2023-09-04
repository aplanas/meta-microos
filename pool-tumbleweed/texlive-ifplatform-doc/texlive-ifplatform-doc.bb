SUMMARY = "Documentation for texlive-ifplatform"
DESCRIPTION = "This package includes the documentation for texlive-ifplatform"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4asvn45533"

RPM_NAME = "texlive-ifplatform-doc-2023.209.0.0.4asvn45533-54.1.noarch.rpm"
RPM_HASH = "69d2f39dd52eff5ec0e449b83709ac2c591f09ce96ef2b129c9b8df11ccb7fbc36e469964eb60f586675a3aaef3f3d5fdd71b8e15472a012fba86f5e47e45cc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifplatform-doc"

RDEPENDS:${PN} += ""

inherit rpm
