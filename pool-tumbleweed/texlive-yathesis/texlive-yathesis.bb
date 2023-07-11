SUMMARY = "A LaTeX class for writing a thesis following French rules"
DESCRIPTION = "The purpose of yathesis is to facilitate the typesetting of \
theses prepared in France, whatever the disciplines and \
institutes. It implements most notably recommendations from the \
Ministry of Higher Education and Research, and this \
transparently to the user. It has also been designed to \
(optionally) take advantage of powerful tools available in \
LaTeX, including packages: BibLaTeX for the bibliography; \
glossaries for the glossary, list of acronyms and symbols list. \
The yathesis class, based on the book class, aims to be both \
simple to use and, to some extent, (easily) customizable. \
yathesis comes with templates and samples in the \
doc/latex/yathesis/french/exemples/ directory in the \
distribution. They can also be tested on ShareLaTeX (template \
and specimen) and on Overleaf (template and specimen). Note: \
The 'ya' in the package name stands for 'yet another'."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.11svn66146"

RPM_NAME = "texlive-yathesis-2023.201.1.0.11svn66146-52.2.noarch.rpm"
RPM_HASH = "fa4e2c385f2ac686f406bf350a6ceacb1357ef71dcfe731c87181f0048d5f05e747f4e64102ef4c29b887068135e6e81a55959d8a96ca113306d8e1aa1b2459b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-yathesis-demo.sty \
tex-yathesis-translations.tex \
tex-yathesis.cls \
texlive-yathesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-array.sty \
tex-babel.sty \
tex-biblatex.sty \
tex-book.cls \
tex-bookmark.sty \
tex-colophon.sty \
tex-csquotes.sty \
tex-datatool.sty \
tex-datetime2.sty \
tex-draftwatermark.sty \
tex-environ.sty \
tex-epigraph.sty \
tex-etoc.sty \
tex-etoolbox.sty \
tex-fncychap.sty \
tex-geometry.sty \
tex-glossaries-babel.sty \
tex-glossaries-english.ldf \
tex-graphicx.sty \
tex-hypcap.sty \
tex-ifdraft.sty \
tex-iflang.sty \
tex-iftex.sty \
tex-letltxmacro.sty \
tex-marvosym.sty \
tex-morewrites.sty \
tex-nonumonpart.sty \
tex-pgfopts.sty \
tex-setspace.sty \
tex-tabularx.sty \
tex-tcolorbox.sty \
tex-titlesec.sty \
tex-tocbibind.sty \
tex-translator.sty \
tex-twoopt.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xkeyval.sty \
tex-xparse.sty \
tex-xpatch.sty \
tex-xstring.sty \
tex-zref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
