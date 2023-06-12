SUMMARY = "Documentation for texlive-hep-reference"
DESCRIPTION = "This package includes the documentation for texlive-hep-reference"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64853"

RPM_NAME = "texlive-hep-reference-doc-2023.201.1.1svn64853-53.1.noarch.rpm"
RPM_HASH = "b06cb638bc60c5bffdaf66d38b2da7dbb94c26e349ed278c9ed3c92922f61e1b1fb5b4d94fab3c68d587b0857e477a5744f6f94c758ffc412f7687ce9ae3abba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-reference-doc"
RDEPENDS:${PN} += ""

inherit rpm
