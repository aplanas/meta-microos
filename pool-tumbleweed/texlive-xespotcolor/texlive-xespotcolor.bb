SUMMARY = "Spot colours support for XeLaTeX"
DESCRIPTION = "The package provides macros for using spot colours in LaTeX \
documents. The package is a reimplementation of the spotcolor \
package for use with XeLaTeX. As such, it has the same user \
interface and the same capabilities."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn58212"

RPM_NAME = "texlive-xespotcolor-2023.209.2.1svn58212-53.1.noarch.rpm"
RPM_HASH = "c7e2eebb91fefa566b6112980d0f2f42935ea53b1a62039ffff24eef7fff301c9a68f44cc399cf8da9e68185011a38a0b20edb607cabd9aac9c3072a8c65eab4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xespotcolor.sty \
texlive-xespotcolor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-graphics.sty \
tex-iftex.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
