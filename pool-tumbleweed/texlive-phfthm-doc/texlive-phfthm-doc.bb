SUMMARY = "Documentation for texlive-phfthm"
DESCRIPTION = "This package includes the documentation for texlive-phfthm"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn60735"

RPM_NAME = "texlive-phfthm-doc-2023.209.1.2svn60735-52.1.noarch.rpm"
RPM_HASH = "861c8a09731e12e7f884cc6aa1d1faf82d15fbb104465fc581f8b821d247fc2780cb79c4d1ecca4d897f8d2a5cee2cfb6838032c14d8a5fa7092cebc25597abf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phfthm-doc"

RDEPENDS:${PN} += ""

inherit rpm
