SUMMARY = "Repeating of math operator at the broken line and the new line in inline equations"
DESCRIPTION = "Repeating of math operators at the broken line and the new line \
in inline equations is used in Cyrillic mathematical typography \
(Russian for example), but unfortunately LaTeX does not provide \
such an option. This package solves the problem by extending \
ideas described in M. I. Grinchuk 'TeX and Russian Traditions \
of Typesetting', TUGboat 17(4) (1996) 385 and supports most of \
LaTeX mathematical packages. See the documentation for details."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.1svn57173"

RPM_NAME = "texlive-rmathbr-2023.201.1.1.1svn57173-53.2.noarch.rpm"
RPM_HASH = "5d2e470e7bc8f2315437c12445486344a93ded56d0732c12e4ff6a0db402bc3cc25ebfa26c2e9c1b8ecf50a5ab57b7fd8b936913394b66bc674537f68a6e83b9"
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
