SUMMARY = "A LaTeX class for producing nice-looking handouts"
DESCRIPTION = "This package breaks with some of LaTeX's principles and \
redefines basic LaTeX commands with the aim of producing \
well-designed and clearly structured handouts: A sans-serif \
font is used by default; sections are not numbered, but \
highlighted by underlining; head- and footline display document \
information; and in order to avoid too much whitespace around \
the text the margin sizes are adjusted to smaller values. All \
in all, fancyhandout provides a means of typesetting documents \
not exclusively consisting of running text in a beautiful way. \
fancyhandout depends on the following other LaTeX packages: \
csquotes, enumitem, etoolbox, fancyhdr, geometry, and xcolor."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn46411"

RPM_NAME = "texlive-fancyhandout-2023.201.svn46411-52.1.noarch.rpm"
RPM_HASH = "67daa27ff94636c91d4bee89162b0b71ddd43f377adc4fc552e3136e32941cba3a24cbf44facb7f5171938eec6f62ae51b7abc74c993c0bdfdd0f0eabf770e9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancyhandout.cls \
texlive-fancyhandout"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-csquotes.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
