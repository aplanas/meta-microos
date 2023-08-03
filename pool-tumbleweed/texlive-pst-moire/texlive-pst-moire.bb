SUMMARY = "A PSTricks package to draw moire patterns"
DESCRIPTION = "This is a PSTricks package to draw moire patterns."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn60411"

RPM_NAME = "texlive-pst-moire-2023.209.2.2svn60411-53.1.noarch.rpm"
RPM_HASH = "87125ac48260843feb3e9804aa8d2aed2cfebfbf54d843447a68e743ef9df6a97db7886fcf82432606c3fd62c8c38c7f9785658311d4c3cb33900d333df62be5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-moire.sty \
tex-pst-moire.tex \
texlive-pst-moire"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
