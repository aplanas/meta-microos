SUMMARY = "Documentation for texlive-hitec"
DESCRIPTION = "This package includes the documentation for texlive-hitec"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0betasvn15878"

RPM_NAME = "texlive-hitec-doc-2023.201.0.0.0betasvn15878-53.2.noarch.rpm"
RPM_HASH = "694cac41589e51232965915143a3b00806eb6e6d138954a920ea725f9b3ba9f13ce8cb0f42b3f1a4eb2c2c71b7b0b5ebfe854c5d16b5c783587bb8d7a6697478"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hitec-doc"

RDEPENDS:${PN} += ""

inherit rpm
