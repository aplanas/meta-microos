SUMMARY = "Repeating of math operator at the broken line and the new line in inline equations"
DESCRIPTION = "Repeating of math operators at the broken line and the new line \
in inline equations is used in Cyrillic mathematical typography \
(Russian for example), but unfortunately LaTeX does not provide \
such an option. This package solves the problem by extending \
ideas described in M. I. Grinchuk 'TeX and Russian Traditions \
of Typesetting', TUGboat 17(4) (1996) 385 and supports most of \
LaTeX mathematical packages. See the documentation for details."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.1svn57173"

RPM_NAME = "texlive-rmathbr-2023.209.1.1.1svn57173-54.1.noarch.rpm"
RPM_HASH = "31382c1b12329f74fd4569b9962131a0ea4bda10266f334e9e5b7146642e15cfc8c05468572f08cf906d4bcdb0e538663649d35d55de170e4124879844e2aebd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rmathbr.sty \
texlive-rmathbr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-ifetex.sty \
tex-ifluatex.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
