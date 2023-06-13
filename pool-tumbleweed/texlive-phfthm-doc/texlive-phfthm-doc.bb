SUMMARY = "Documentation for texlive-phfthm"
DESCRIPTION = "This package includes the documentation for texlive-phfthm"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn60735"

RPM_NAME = "texlive-phfthm-doc-2023.201.1.2svn60735-51.1.noarch.rpm"
RPM_HASH = "92b1a8b7b6b3f99b57c9998b08e1eb325fcf436dc79c37001e4f9e23ade0ea3e4a055cc9159e205377661815261182afefcc344184133cb1b085b1121735c22a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phfthm-doc"

RDEPENDS:${PN} += ""

inherit rpm
