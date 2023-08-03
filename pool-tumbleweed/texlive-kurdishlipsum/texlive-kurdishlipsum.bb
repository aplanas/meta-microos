SUMMARY = "A 'lipsum' package for the Kurdish language"
DESCRIPTION = "This package provides lipsum-like facilities for the Kurdish \
language. The package gives you easy access to the Kurdish \
poetry and balladry texts of the Diwany Vafaiy, Ahmedy Xani, \
Naly, Mahwy,.... The package needs to be run under XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47518"

RPM_NAME = "texlive-kurdishlipsum-2023.209.1.1svn47518-56.1.noarch.rpm"
RPM_HASH = "ceeb9341b2761d13d02b4a1c2ca7225eb505ab7caeabd26263fa772167b9c0b106677e407757cd528b9ec713c79e01e10d58822d4862aa2cf7c2b173f1563b98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kurdishlipsum.sty \
texlive-kurdishlipsum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biditools.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
