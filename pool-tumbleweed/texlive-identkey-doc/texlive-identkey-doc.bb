SUMMARY = "Documentation for texlive-identkey"
DESCRIPTION = "This package includes the documentation for texlive-identkey"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.0.0.1.0svn61719"

RPM_NAME = "texlive-identkey-doc-2023.208.0.0.1.0svn61719-53.1.noarch.rpm"
RPM_HASH = "0c6a09d505acde8dccc834bbeb69b3ffe9d4b8cfd8dbe2cebf887d22876d1921cfbd73485347a7eece024513cd7c6ac6b1ea4f2055187252d3bf412bd3f4817a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-identkey-doc"

RDEPENDS:${PN} += ""

inherit rpm
