SUMMARY = "Documentation for texlive-gtrlib-largetrees"
DESCRIPTION = "This package includes the documentation for texlive-gtrlib-largetrees"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2bsvn49062"

RPM_NAME = "texlive-gtrlib-largetrees-doc-2023.201.1.2bsvn49062-53.2.noarch.rpm"
RPM_HASH = "96ad64dd165776b9732fef826167f7a2a911e84ca63eeb1c8c21f02abae1deb697a40941de1d9257ae054d7139a37a18db67cb9b8f53fcb91755ef9a948c4213"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gtrlib-largetrees-doc"

RDEPENDS:${PN} += ""

inherit rpm
