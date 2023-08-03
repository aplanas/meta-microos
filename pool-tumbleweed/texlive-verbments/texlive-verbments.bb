SUMMARY = "Syntax highlighting of source code in LaTeX documents"
DESCRIPTION = "The package provides an environment for syntax highlighting \
source code in LaTeX documents. The highlighted source code \
output is formatted via powerful Pygments library of the Python \
language."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn23670"

RPM_NAME = "texlive-verbments-2023.209.1.2svn23670-54.1.noarch.rpm"
RPM_HASH = "bbbe105c92a86344d2834a1b6d4cebee990d2f1275c4f9bf6de20bb3b81ea91f12952148a58a1bba9395a134eccae3145aacd334a857334e35038788a826e937"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-verbments.sty \
texlive-verbments"

RDEPENDS:${PN} += "/usr/bin/sh \
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
