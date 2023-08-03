SUMMARY = "Documentation for texlive-texdef"
DESCRIPTION = "This package includes the documentation for texlive-texdef"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.9svn64967"

RPM_NAME = "texlive-texdef-doc-2023.209.1.9svn64967-55.1.noarch.rpm"
RPM_HASH = "555d9bab4f67d93679673603113fc9d6771fecda43bf7ea76383764d829d97a6a7a078be936898d72dcdf2b6c349ccc17348f641a4e25fee3fe3ec94bcc6d0b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texdef-doc"

RDEPENDS:${PN} += ""

inherit rpm
