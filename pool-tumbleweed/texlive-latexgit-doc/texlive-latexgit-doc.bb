SUMMARY = "Documentation for texlive-latexgit"
DESCRIPTION = "This package includes the documentation for texlive-latexgit"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn54811"

RPM_NAME = "texlive-latexgit-doc-2023.209.svn54811-55.1.noarch.rpm"
RPM_HASH = "23d1da229734d947cf30bda97276e30648a77c626f640ff8fc3034bc5bddd4ed1b51e4fa0f7ef686be267c9392066f4ff6e7cb3e33202770b063a9b5be134c63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexgit-doc"

RDEPENDS:${PN} += ""

inherit rpm
