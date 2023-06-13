SUMMARY = "Documentation for texlive-nuc"
DESCRIPTION = "This package includes the documentation for texlive-nuc"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn22256"

RPM_NAME = "texlive-nuc-doc-2023.201.0.0.1svn22256-54.1.noarch.rpm"
RPM_HASH = "2f09a289d64ade5ee5019425e8a7bedbaa3e9b1cb502eae56a5c2151c9226d2d1cea6988da23bb32c47b14a3cad000c64f2a7179d23d80eed93ca48eeef9cf2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nuc-doc"

RDEPENDS:${PN} += ""

inherit rpm
