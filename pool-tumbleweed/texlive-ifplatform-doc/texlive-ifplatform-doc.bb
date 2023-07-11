SUMMARY = "Documentation for texlive-ifplatform"
DESCRIPTION = "This package includes the documentation for texlive-ifplatform"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.4asvn45533"

RPM_NAME = "texlive-ifplatform-doc-2023.208.0.0.4asvn45533-53.1.noarch.rpm"
RPM_HASH = "cbe511bb793a0712a2a4bbf75250c3c9de88708c21fa5e7ac4b45470a2f782b6b33d2255288e98c2e3fb0b16ac089ba5db5f57583be45d973cec5c98b2c2b87c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifplatform-doc"

RDEPENDS:${PN} += ""

inherit rpm
