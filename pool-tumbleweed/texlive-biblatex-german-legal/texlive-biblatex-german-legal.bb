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

PV = "2023.201.003svn66461"

RPM_NAME = "texlive-biblatex-german-legal-2023.201.003svn66461-53.1.noarch.rpm"
RPM_HASH = "8ba9c2fe2bfbc42841581f264fedb3b8890b4ed235c4b7e27877b79d70b493af83fee6f2c8a3eeeb050dfc9057aac4e018b7c9faf9afc0f8f0039195a5f54dbc"
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
