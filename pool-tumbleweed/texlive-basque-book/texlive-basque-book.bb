SUMMARY = "Class for book-type documents written in Basque"
DESCRIPTION = "The class is derived from the LaTeX book class. The extensions \
solve grammatical and numeration issues that occur when \
book-type documents are written in Basque. The class is useful \
for writing books, PhD and Master Theses, etc., in Basque."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.20svn32924"

RPM_NAME = "texlive-basque-book-2023.209.1.20svn32924-54.1.noarch.rpm"
RPM_HASH = "0ee2ab173964759fb93a07643fb671cffcb9ce9dc603b93356c36b777e61c07b847acdafa1492c72ac89cf379e73b2b76928a74ac94d77e35d6dee18f2cd8914"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-basque-book.cls \
texlive-basque-book"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-basque-date.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
