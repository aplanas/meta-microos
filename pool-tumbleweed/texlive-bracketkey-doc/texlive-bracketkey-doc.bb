SUMMARY = "Documentation for texlive-bracketkey"
DESCRIPTION = "This package includes the documentation for texlive-bracketkey"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn17129"

RPM_NAME = "texlive-bracketkey-doc-2023.209.1.0svn17129-53.1.noarch.rpm"
RPM_HASH = "43c8c6fc36ecb9b2b6452c5ce041e46c9242cf5bee6f2a2e5c8feb11a04dc3bf1b9c97a102fc6afc1d7fadc68237b4adba43e513c07b5818004454a35960fc35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bracketkey-doc"

RDEPENDS:${PN} += ""

inherit rpm
