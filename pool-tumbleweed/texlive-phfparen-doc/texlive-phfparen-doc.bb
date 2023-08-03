SUMMARY = "Documentation for texlive-phfparen"
DESCRIPTION = "This package includes the documentation for texlive-phfparen"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn41859"

RPM_NAME = "texlive-phfparen-doc-2023.209.1.0svn41859-52.1.noarch.rpm"
RPM_HASH = "8a5f037b361be140a7d2dcf5ca7dd50a7cfb5a58e232a1ca1a3a7545e554073790fedda154b5e73bc2abcac585921ab0a86fdeae9c5c6217c729fad7db2ba66a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phfparen-doc"

RDEPENDS:${PN} += ""

inherit rpm
