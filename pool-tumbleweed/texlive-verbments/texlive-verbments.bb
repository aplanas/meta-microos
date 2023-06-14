SUMMARY = "Syntax highlighting of source code in LaTeX documents"
DESCRIPTION = "The package provides an environment for syntax highlighting \
source code in LaTeX documents. The highlighted source code \
output is formatted via powerful Pygments library of the Python \
language."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn23670"

RPM_NAME = "texlive-verbments-2023.201.1.2svn23670-53.1.noarch.rpm"
RPM_HASH = "dcb0cf53bfe97404fc5af459f621cd1503fa9d4bbf9d854bed6c3d5333c48d6e3358509e1289ae8c09315c0d332fe4acd6bd9d0483f992d9e6c7c2b5c2fbe1f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-verbments.sty \
texlive-verbments"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fancyvrb.sty \
tex-framed.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
