SUMMARY = "Documentation for texlive-codicefiscaleitaliano"
DESCRIPTION = "This package includes the documentation for texlive-codicefiscaleitaliano"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn29803"

RPM_NAME = "texlive-codicefiscaleitaliano-doc-2023.209.1.2svn29803-54.1.noarch.rpm"
RPM_HASH = "f93d7936e63ddecb452c180b38d0b143ae507ea965f81af7fe0ddbec84b8c95d472e10bcd6b5731e27aa860da69562c6d343da0a4a45303fce783a399784a539"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-codicefiscaleitaliano-doc-it \
texlive-codicefiscaleitaliano-doc"

RDEPENDS:${PN} += ""

inherit rpm
