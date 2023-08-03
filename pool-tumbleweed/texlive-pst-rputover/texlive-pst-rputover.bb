SUMMARY = "Place text over objects without obscuring background colors"
DESCRIPTION = "This is a PSTricks package which allows to place text over \
objects without obscuring background colors."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn44724"

RPM_NAME = "texlive-pst-rputover-2023.209.1.0svn44724-54.1.noarch.rpm"
RPM_HASH = "63a316054eadb8805b1116b505bb8250ed9f710d3fd21fed13aef765d8d85d5c282a191fd1c7ec359172a0e826d324485af5ed348274fb8f5d8f007659f16b6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-rputover.sty \
tex-pst-rputover.tex \
texlive-pst-rputover"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-node.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
