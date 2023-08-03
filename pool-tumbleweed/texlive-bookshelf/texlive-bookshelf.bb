SUMMARY = "Create a nice image from a BibTeX file"
DESCRIPTION = "This package turns a BibTeX bibliography file into a \
randomly-coloured, randomly-sized shelf of books, with the \
title and author in a randomly-chosen typeface."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn55475"

RPM_NAME = "texlive-bookshelf-2023.209.0.0.5svn55475-53.1.noarch.rpm"
RPM_HASH = "ef9ce4712666717baa73f0eb1d6c1a5ac96c947406a6e52e812e2b7150ea36251c317c08a895fb7be0d7351ec5663b114b8443bf5e4654ab79b3c6f38aab2e46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bookshelf.cls \
texlive-bookshelf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-eso-pic.sty \
tex-fix-cm.sty \
tex-fontspec.sty \
tex-fp.sty \
tex-graphicx.sty \
tex-random.tex \
tex-report.cls \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
