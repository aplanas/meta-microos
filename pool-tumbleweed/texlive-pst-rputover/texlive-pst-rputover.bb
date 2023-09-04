SUMMARY = "Place text over objects without obscuring background colors"
DESCRIPTION = "This is a PSTricks package which allows to place text over \
objects without obscuring background colors."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn44724"

RPM_NAME = "texlive-pst-rputover-2023.209.1.0svn44724-54.2.noarch.rpm"
RPM_HASH = "3582f668e6fc9a5bd1cccb12abf6a1ffb717fa8df713f728f7ce3d62205ef9e752fbcfdc0c66c59faf74d455a78d2643f6f9aef23fc689c1b39d14d7240fd0b2"
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
