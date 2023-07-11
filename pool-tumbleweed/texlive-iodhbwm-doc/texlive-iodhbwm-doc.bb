SUMMARY = "Documentation for texlive-iodhbwm"
DESCRIPTION = "This package includes the documentation for texlive-iodhbwm"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2.2svn57773"

RPM_NAME = "texlive-iodhbwm-doc-2023.208.1.2.2svn57773-53.1.noarch.rpm"
RPM_HASH = "40f5261f5943d43e3ef9536d3a954b20e4f7e82751f690d43e776907f2c982fe7b9fdd449909ea741578034a5664103b205b62e7c1e8c0420bd1d12a814f5020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-iodhbwm-doc-de \
texlive-iodhbwm-doc"

RDEPENDS:${PN} += ""

inherit rpm
