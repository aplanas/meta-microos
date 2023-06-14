SUMMARY = "Adjust TeX logos, with font detection"
DESCRIPTION = "This package extends the metalogo package to automatically \
adjust the appearance of the logos TeX, LaTeX, LaTeX2e, \
XeLaTeX, and LuaLaTeX, depending on the font detected or the \
option given to metalogox. Most of the serif and sans fonts \
listed at The LaTeX Font Catalogue are supported. The package \
depends on metalogo, xparse, and etoolbox."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn65448"

RPM_NAME = "texlive-metalogox-2023.201.1.01svn65448-54.1.noarch.rpm"
RPM_HASH = "84b23fa12dbd08375f8fb6b97eb01fdf22ba9f0d3ec20d053c70742278c486c1a88cfda858683a9ddc0de78aac33cb90dcef1778a6481c7c2abe9a73388850ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-metalogox.sty \
texlive-metalogox"

RDEPENDS:${PN} += "/bin/sh \
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
