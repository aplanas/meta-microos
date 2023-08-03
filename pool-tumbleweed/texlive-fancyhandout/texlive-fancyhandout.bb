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

PV = "2023.209.svn46411"

RPM_NAME = "texlive-fancyhandout-2023.209.svn46411-53.1.noarch.rpm"
RPM_HASH = "6f9a9045ff390e69500db558eed3d36861e9cf0cf6f6b6cb4a29596addd7acf0379736ece61911baffd6f4ce3c0be542cdfc51343e79f5b2a3f7420ad96f200a"
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
