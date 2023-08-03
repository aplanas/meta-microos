SUMMARY = "Documentation for texlive-tabularborder"
DESCRIPTION = "This package includes the documentation for texlive-tabularborder"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn17885"

RPM_NAME = "texlive-tabularborder-doc-2023.209.1.0asvn17885-55.1.noarch.rpm"
RPM_HASH = "6505d0c7bb8d60569c6aead70a8f847259a5fdd8670e6aaf73bbf72f59ccf91b49e37f86508fb49f2b0ee99900a3b90a5862bbdc607b2839519310bd711edd33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabularborder-doc"

RDEPENDS:${PN} += ""

inherit rpm
