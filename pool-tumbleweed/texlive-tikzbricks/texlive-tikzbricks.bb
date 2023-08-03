SUMMARY = "Drawing bricks with TikZ"
DESCRIPTION = "A small LaTeX package to draw bricks with TikZ. The user can \
modify color, shape, and viewpoint."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn63952"

RPM_NAME = "texlive-tikzbricks-2023.209.0.0.4svn63952-53.1.noarch.rpm"
RPM_HASH = "adda8c36a0e1d76a48e5fddacedb488f6deaaedc285aff119d243f007d74a367e34f834e8afcada8d25cee713f42d271b574d29ce9e55e24a8a8cf85c6d53f6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzbricks.sty \
texlive-tikzbricks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz-3dplot.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
