SUMMARY = "Draw trees with more than one root node, using PSTricks"
DESCRIPTION = "The package uses PSTricks to draw trees with more than one root \
node. It is similar to pst-tree, though it uses a different \
placement algorithm."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn23451"

RPM_NAME = "texlive-pst-tvz-2023.201.1.01svn23451-53.1.noarch.rpm"
RPM_HASH = "021bd9a0ed4efc7ef3a38e30ef92b8511198f6b478a92b03ca7a12299e3b06ce8ab949183f1f8c190d5a3c45f0d64cd69736c758e341ba6fe053ce35b3c5394d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-tvz.sty) \
tex(pst-tvz.tex) \
texlive-pst-tvz"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
