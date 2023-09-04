SUMMARY = "Draw trees with more than one root node, using PSTricks"
DESCRIPTION = "The package uses PSTricks to draw trees with more than one root \
node. It is similar to pst-tree, though it uses a different \
placement algorithm."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn23451"

RPM_NAME = "texlive-pst-tvz-2023.209.1.01svn23451-54.2.noarch.rpm"
RPM_HASH = "1e5b7e10de69c120d9d27591281051b5bacc642502484319c1e1caa5f26d91249f907521b36d07f3cb0c93fa13f095299912a879f01a768051198325a22f3ca9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-tvz.sty \
tex-pst-tvz.tex \
texlive-pst-tvz"

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
