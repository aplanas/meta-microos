SUMMARY = "Documentation for texlive-eepic"
DESCRIPTION = "This package includes the documentation for texlive-eepic"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.1esvn15878"

RPM_NAME = "texlive-eepic-doc-2023.201.1.1esvn15878-53.1.noarch.rpm"
RPM_HASH = "1172a70d881c68bcdd44dda8cf318e741e97e684fc7a6a66ee44fc0f826ecf78291ec4168cea884b8e0fcd9e50cc44d81b10bbfd0bb7795e6738cf4314c3d9eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eepic-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
