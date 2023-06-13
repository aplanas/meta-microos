SUMMARY = "Documentation for texlive-pfdicons"
DESCRIPTION = "This package includes the documentation for texlive-pfdicons"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn60089"

RPM_NAME = "texlive-pfdicons-doc-2023.201.1.0asvn60089-51.1.noarch.rpm"
RPM_HASH = "93740c9537ae0b80108a91b353d1056f7d5109ce4161cd1490fe07de42ef865bfcf0a473e82d9b5acc3c88981dcf04e8a7492166ce02ce4d5515a50cf9af0224"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pfdicons-doc"

RDEPENDS:${PN} += ""

inherit rpm
