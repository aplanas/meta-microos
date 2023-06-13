SUMMARY = "Create a nice image from a BibTeX file"
DESCRIPTION = "This package turns a BibTeX bibliography file into a \
randomly-coloured, randomly-sized shelf of books, with the \
title and author in a randomly-chosen typeface."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn55475"

RPM_NAME = "texlive-bookshelf-2023.201.0.0.5svn55475-52.1.noarch.rpm"
RPM_HASH = "eedf2ec1aabacf5c1240d99c03fe92e2981643d9c57ddd4208725ecbe26c2e8098f7d19374764d20cbd8731e5cb599707780adb6146dd8c03e7fe9c90ad7acfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bookshelf.cls) \
texlive-bookshelf"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(eso-pic.sty) \
tex(fix-cm.sty) \
tex(fontspec.sty) \
tex(fp.sty) \
tex(graphicx.sty) \
tex(random.tex) \
tex(report.cls) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
