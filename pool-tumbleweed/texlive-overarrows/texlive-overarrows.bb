SUMMARY = "Custom extensible arrows over math expressions"
DESCRIPTION = "A LaTeX package to create custom arrows over math expressions, \
mainly for vectors (but arrows can as well be drawn below). \
Arrows stretch with content, scale with math styles, and have a \
correct kerning when a subscript follows. Some predefined \
commands are also provided."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn65853"

RPM_NAME = "texlive-overarrows-2023.209.1.1svn65853-55.1.noarch.rpm"
RPM_HASH = "1f0e43873a0c26cf88ad36db82cfb3bf264333bdeda98978a674a0f3592629d3c9c8acfdc60df2233d1536e3f9f3c21838e543e0b41023a5748cf36ae7cc6d79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-overarrows.sty \
texlive-overarrows"

RDEPENDS:${PN} += "/usr/bin/sh \
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
