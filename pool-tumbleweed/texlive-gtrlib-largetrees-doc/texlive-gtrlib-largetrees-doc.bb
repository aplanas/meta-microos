SUMMARY = "Documentation for texlive-gtrlib-largetrees"
DESCRIPTION = "This package includes the documentation for texlive-gtrlib-largetrees"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2bsvn49062"

RPM_NAME = "texlive-gtrlib-largetrees-doc-2023.201.1.2bsvn49062-53.1.noarch.rpm"
RPM_HASH = "81d22960fb43df4e3a254c1cb9ff5cba4e58c0c573fe0945b319d48f5f9a8741ef50c379a751ff1dfe311060e9014cb7999958cff2cebe49c74d501050977c0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gtrlib-largetrees-doc"

RDEPENDS:${PN} += ""

inherit rpm
