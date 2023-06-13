SUMMARY = "Create commutative diagrams with TikZ"
DESCRIPTION = "The general-purpose drawing package TiKZ can be used to typeset \
commutative diagrams and other kinds of mathematical pictures, \
generating high-quality results. The purpose of this package is \
to make the process of creation of such diagrams easier by \
providing a convenient set of macros and reasonable default \
settings. This package also includes an arrow tip library that \
match closely the arrows present in the Computer Modern \
typeface."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn59133"

RPM_NAME = "texlive-tikz-cd-2023.201.1.0svn59133-54.1.noarch.rpm"
RPM_HASH = "6cfebb2a212723532d554dad64113fb19d3acff8e577d73b80948046617e37ea775eb51c00318cb10e12449cb0516a6bdc3ebd515113b750c15f5602a422318b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikz-cd.sty) \
tex(tikzlibrarycd.code.tex) \
texlive-tikz-cd"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
