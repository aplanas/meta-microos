SUMMARY = "Custom extensible arrows over math expressions"
DESCRIPTION = "A LaTeX package to create custom arrows over math expressions, \
mainly for vectors (but arrows can as well be drawn below). \
Arrows stretch with content, scale with math styles, and have a \
correct kerning when a subscript follows. Some predefined \
commands are also provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn65853"

RPM_NAME = "texlive-overarrows-2023.201.1.1svn65853-54.1.noarch.rpm"
RPM_HASH = "bd0156cd910b2c4ba886257f1941cb7d982e7dac0ac08ec8c449ae1e186edfd61b8085c6f5d7a80a73ee3b0d5b84fee462320333b331a43d6c9ea3ad9f88fe59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-overarrows.sty \
texlive-overarrows"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-esvect.sty \
tex-etoolbox.sty \
tex-old-arrows.sty \
tex-pgfkeys.sty \
tex-pict2e.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
