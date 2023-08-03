SUMMARY = "Documentation for texlive-metaobj"
DESCRIPTION = "This package includes the documentation for texlive-metaobj"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.93svn15878"

RPM_NAME = "texlive-metaobj-doc-2023.209.0.0.93svn15878-55.1.noarch.rpm"
RPM_HASH = "0ed0d0fc9b5f02480e9e2c0fac4a17a7f9b897535497b53eccee489ee6ddf595fb040008443b6b702b108db307d93bf984d9016aa448a5c2e44f37025e50faa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metaobj-doc"

RDEPENDS:${PN} += ""

inherit rpm
