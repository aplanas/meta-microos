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

PV = "2023.209.1.0svn59133"

RPM_NAME = "texlive-tikz-cd-2023.209.1.0svn59133-55.1.noarch.rpm"
RPM_HASH = "d779472c2f8906d81b9b76f290ac65c200233f349204d6ed2a869e3acc43572e01de6755c95c91b045bccdcb1daaa0071b0893ec72ea3bc279b0fc53c55ebbbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-cd.sty \
tex-tikzlibrarycd.code.tex \
texlive-tikz-cd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
