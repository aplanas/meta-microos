SUMMARY = "Documentation for texlive-pseudo"
DESCRIPTION = "This package includes the documentation for texlive-pseudo"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.2svn65690"

RPM_NAME = "texlive-pseudo-doc-2023.209.1.2.2svn65690-53.1.noarch.rpm"
RPM_HASH = "f3360bdd1013d80164f254a585b037c2d8caf1e48dab110d40d7bdd8ab2e5834875c63d5ac40c90a13baba9713437d934fdcc046f655cab83998ebe1da54334a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pseudo-doc"

RDEPENDS:${PN} += ""

inherit rpm
