SUMMARY = "Fix uneven spacing around ellipses in LaTeX text mode"
DESCRIPTION = "This is a simple package that fixes a problem in the way LaTeX \
handles ellipses: it always puts a tiny bit more space after \
\\dots in text mode than before it, which results in the \
ellipsis being off-center when used between two words."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn55418"

RPM_NAME = "texlive-ellipsis-2023.209.1.8svn55418-54.2.noarch.rpm"
RPM_HASH = "557514be0bfd26e1558fe662ec8ce9883149defb11f0fc137e04592606ed2f4b0669a3d1896eebfad556ac42a199797aec1bdebd6205f41c9502007d9a7b2139"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ellipsis.sty \
texlive-ellipsis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
