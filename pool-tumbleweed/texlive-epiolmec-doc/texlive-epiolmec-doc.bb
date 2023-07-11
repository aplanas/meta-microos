SUMMARY = "Documentation for texlive-epiolmec"
DESCRIPTION = "This package includes the documentation for texlive-epiolmec"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-epiolmec-doc-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "8988190ab6c134a8786fc9f928f34d130b51465341dc3ecac38e65246bb3de7f8ce6a176027f28ddcec22419fdd5f662f3a508b68f46cabfc5c1b2e0224b24ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epiolmec-doc"

RDEPENDS:${PN} += ""

inherit rpm
