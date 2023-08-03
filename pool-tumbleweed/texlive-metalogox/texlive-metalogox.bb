SUMMARY = "Adjust TeX logos, with font detection"
DESCRIPTION = "This package extends the metalogo package to automatically \
adjust the appearance of the logos TeX, LaTeX, LaTeX2e, \
XeLaTeX, and LuaLaTeX, depending on the font detected or the \
option given to metalogox. Most of the serif and sans fonts \
listed at The LaTeX Font Catalogue are supported. The package \
depends on metalogo, xparse, and etoolbox."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn65448"

RPM_NAME = "texlive-metalogox-2023.209.1.01svn65448-55.1.noarch.rpm"
RPM_HASH = "f8c7585d9219db317164d7e84328a14f199c0da2fce2802e19d3b7db5d0d3fc67a67f79a4aa9ef7d37b681a5f660b403f2f7ffdf97cf0964d8043ac5d83be975"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-metalogox.sty \
texlive-metalogox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-metalogo.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
