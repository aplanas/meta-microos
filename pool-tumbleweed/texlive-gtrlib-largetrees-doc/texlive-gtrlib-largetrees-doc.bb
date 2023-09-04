SUMMARY = "Documentation for texlive-gtrlib-largetrees"
DESCRIPTION = "This package includes the documentation for texlive-gtrlib-largetrees"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2bsvn49062"

RPM_NAME = "texlive-gtrlib-largetrees-doc-2023.209.1.2bsvn49062-54.2.noarch.rpm"
RPM_HASH = "bbf6413b43b2e9bbb40fb6d272c4ced13d02c3032cc640bfab995be65d26a0844357cfb7cb691f70516fc4f02892a7f48ec2d0126a3aff006e3fdd9c90553fed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gtrlib-largetrees-doc"

RDEPENDS:${PN} += ""

inherit rpm
