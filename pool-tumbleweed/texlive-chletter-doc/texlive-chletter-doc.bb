SUMMARY = "Documentation for texlive-chletter"
DESCRIPTION = "This package includes the documentation for texlive-chletter"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn20060"

RPM_NAME = "texlive-chletter-doc-2023.209.2.0svn20060-54.1.noarch.rpm"
RPM_HASH = "65ffc299a141fd1266617dcf87f40fcd89b8fae7cd2bdb2eb7923b88f71a97f527f43e693d084a3874ff41863bc2132080acb91171bd280f7f0490a71c949385"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-chletter-doc-en \
texlive-chletter-doc"

RDEPENDS:${PN} += ""

inherit rpm
