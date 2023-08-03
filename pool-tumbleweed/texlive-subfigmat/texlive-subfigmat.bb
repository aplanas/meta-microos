SUMMARY = "Automates layout when using the subfigure package"
DESCRIPTION = "Defines an array/matrix-type environment that is used with the \
subfigure package to automate the placement of subfigures (or \
tables or text). The subfigures are placed left-to-right, \
top-to-bottom."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn20308"

RPM_NAME = "texlive-subfigmat-2023.209.1.0svn20308-58.1.noarch.rpm"
RPM_HASH = "4d04ddeaa593b2c510f1ece649e6f82929170bef862a75cc8bf106b9ee1fee61a51fe26982b0886b8b79346efbc24ceec803716a21bece91ff2f67c429735702"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-subfigmat.sty \
texlive-subfigmat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-subfigure.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
