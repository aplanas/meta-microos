SUMMARY = "Documentation for texlive-ecltree"
DESCRIPTION = "This package includes the documentation for texlive-ecltree"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn15878"

RPM_NAME = "texlive-ecltree-doc-2023.201.1.1asvn15878-53.1.noarch.rpm"
RPM_HASH = "cebae206d60d2be670eb2c45c3dfc41effb8ff5a3c92e079a7c872709f1923b30ca9fb5df0046fc03f53b3e558b6aee460790af2a4b72122a2d5ef4d7b48e516"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ecltree-doc"

RDEPENDS:${PN} += ""

inherit rpm
