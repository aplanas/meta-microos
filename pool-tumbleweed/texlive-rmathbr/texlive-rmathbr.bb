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

RPM_NAME = "texlive-rmathbr-2023.209.1.1.1svn57173-54.2.noarch.rpm"
RPM_HASH = "98c3c7fdd08f245ede410d855ade4b028de33fadab29c4afa5de35c932d8ea3786af3c0485a74da243f34e0a63167041b8121160c26c7cc83aa1980d3d4c8734"
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
