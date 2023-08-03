SUMMARY = "Draw trees with more than one root node, using PSTricks"
DESCRIPTION = "The package uses PSTricks to draw trees with more than one root \
node. It is similar to pst-tree, though it uses a different \
placement algorithm."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn23451"

RPM_NAME = "texlive-pst-tvz-2023.209.1.01svn23451-54.1.noarch.rpm"
RPM_HASH = "2e7343faf21b560c90d2c740071683dc8b24cf24a489f9c51aeb3de67f7b8aaa011ccbbb47901f70c44a1a141fcdd0d58662740d4eeffee375480bf4eb030553"
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
