SUMMARY = "Documentation for texlive-fge"
DESCRIPTION = "This package includes the documentation for texlive-fge"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.25svn37628"

RPM_NAME = "texlive-fge-doc-2023.201.1.25svn37628-52.1.noarch.rpm"
RPM_HASH = "59cd0b1156517b2c749e93419516bcb0698f921dc33e133e58139262c88e04d9ca5da2d7e631068cd46d9ca1427d5200e4a3c83dc22ba2868567ddcd534dfcfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fge-doc"

RDEPENDS:${PN} += ""

inherit rpm
