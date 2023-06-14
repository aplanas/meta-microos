SUMMARY = "A PSTricks package to draw moire patterns"
DESCRIPTION = "This is a PSTricks package to draw moire patterns."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn60411"

RPM_NAME = "texlive-pst-moire-2023.201.2.2svn60411-52.1.noarch.rpm"
RPM_HASH = "f5e0f7a45d0a6a7751d05b7d3c9b208ebbcbf7507791abdca4bb36e7361ba1c1121644e0a18624afdfd48ca2895cac97cf023cc3d833bcc4df594d366b4cab7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-moire.sty \
tex-pst-moire.tex \
texlive-pst-moire"

RDEPENDS:${PN} += "/bin/sh \
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
