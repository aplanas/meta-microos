SUMMARY = "Extra Arrows beyond those provided in amsmath"
DESCRIPTION = "Arrows are provided to supplement \\xleftarrow and \\xrightarrow \
of the amsath package: \\xlongequal, \\xLongleftarrow, \
\\xLongrightarrow, \\xLongleftrightarrow, \\xLeftrightarrow. \
\\xlongleftrightarrow, \\xleftrightarrow, \\xlongleftarrow and \
\\xlongrightarrow."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.1.2.0svn54400"

RPM_NAME = "texlive-extarrows-2023.209.1.2.0svn54400-53.1.noarch.rpm"
RPM_HASH = "f55ae28d72c02ccb64588a8b90c8c5279c419b14ede6f5caa19580499961623bf41f735cae814f5816719decb574994d2d752817cbdaa6b1d900589bed6401de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-extarrows.sty \
texlive-extarrows"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
