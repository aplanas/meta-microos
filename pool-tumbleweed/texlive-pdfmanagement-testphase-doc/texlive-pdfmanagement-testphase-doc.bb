SUMMARY = "Documentation for texlive-pdfmanagement-testphase"
DESCRIPTION = "This package includes the documentation for texlive-pdfmanagement-testphase"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.95xsvn66532"

RPM_NAME = "texlive-pdfmanagement-testphase-doc-2023.201.0.0.95xsvn66532-51.1.noarch.rpm"
RPM_HASH = "73601e2a3edf42d39270d6aaaaba3fa7f3bed42d2c8386549c2c847d9c3de7d860d0d9e01c9228d52b98f1357c3d13d68dbd58251f4b1077af4a53236df3d425"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfmanagement-testphase-doc"

RDEPENDS:${PN} += ""

inherit rpm
