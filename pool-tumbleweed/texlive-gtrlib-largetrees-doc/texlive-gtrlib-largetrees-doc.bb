SUMMARY = "Documentation for texlive-gtrlib-largetrees"
DESCRIPTION = "This package includes the documentation for texlive-gtrlib-largetrees"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2bsvn49062"

RPM_NAME = "texlive-gtrlib-largetrees-doc-2023.209.1.2bsvn49062-54.1.noarch.rpm"
RPM_HASH = "42770f988a98b2e7ddee1b275895f5bdeff56dd6826a918de767e6eba3c0a8779d19a8b838f73dfb1c06614fa367789e25d35c6a53289e348ef418d2b06853e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gtrlib-largetrees-doc"

RDEPENDS:${PN} += ""

inherit rpm
