SUMMARY = "Place text over objects without obscuring background colors"
DESCRIPTION = "This is a PSTricks package which allows to place text over \
objects without obscuring background colors."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn44724"

RPM_NAME = "texlive-pst-rputover-2023.201.1.0svn44724-53.2.noarch.rpm"
RPM_HASH = "66bb9658543318fd8d40c319e1b2a49ab77842bf6547f1321e3df1bdaad9e0df5bf4f175f0f8f3130e88a2b616b8d0ed6c01e268cf1fc40f809027f129c4500c"
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
