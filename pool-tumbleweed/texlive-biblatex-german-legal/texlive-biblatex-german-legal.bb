SUMMARY = "Comprehensive citation style for German legal texts"
DESCRIPTION = "This package aims to provide citation styles (for footnotes and \
bibliographies) for German legal texts. It is currently focused \
on citations in books (style german-legal-book), but may be \
extended to journal articles in the future. Dieses Paket \
enthalt BibLaTeX-Zitierstile fur die Rechtswissenschaften in \
Deutschland. Aktuell enthalt es einen auf Monographien in den \
deutschen Rechtswissenschaften ausgerichteten Zitierstil namens \
german-legal-book."
LICENSE = "LPPL-1.0"

PV = "2023.209.003svn66461"

RPM_NAME = "texlive-biblatex-german-legal-2023.209.003svn66461-54.1.noarch.rpm"
RPM_HASH = "b75c4c7ec0e63239991ba3b51ed297d7687c23ece54c4850167d4e741d365b5e9496cad3e49a174ffe11857045fac7db5def3bd9dc4e4a216d0783a4b97906ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-german-legal-book.bbx \
tex-german-legal-book.cbx \
texlive-biblatex-german-legal"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ext-authortitle.bbx \
tex-ext-authortitle.cbx \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
