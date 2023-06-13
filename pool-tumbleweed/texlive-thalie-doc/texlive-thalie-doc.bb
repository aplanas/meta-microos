SUMMARY = "Documentation for texlive-thalie"
DESCRIPTION = "This package includes the documentation for texlive-thalie"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.13asvn65249"

RPM_NAME = "texlive-thalie-doc-2023.201.0.0.13asvn65249-54.1.noarch.rpm"
RPM_HASH = "01ab67f81d748ce4bc5d12508484488f500327d4ef2d19b1525bc050e87cc1efe00327438b68a116871a7db81d1604011912b7950db523e3fb8d6f650cfcf2e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thalie-doc"

RDEPENDS:${PN} += ""

inherit rpm
