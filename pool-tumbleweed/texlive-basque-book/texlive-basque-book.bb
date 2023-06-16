SUMMARY = "Class for book-type documents written in Basque"
DESCRIPTION = "The class is derived from the LaTeX book class. The extensions \
solve grammatical and numeration issues that occur when \
book-type documents are written in Basque. The class is useful \
for writing books, PhD and Master Theses, etc., in Basque."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.20svn32924"

RPM_NAME = "texlive-basque-book-2023.201.1.20svn32924-53.1.noarch.rpm"
RPM_HASH = "309f143bbf4c77ace9eec4e846fec620be415ad8c5aa0f8b79678f23b9abdd26c30d94f27702f1ae2822d91cd6d7f7576b6680bbe5594677769e79170a1b0303"
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
