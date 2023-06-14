SUMMARY = "High-quality graphics from MGL scripts embedded in LaTeX documents"
DESCRIPTION = "This package allows you to create high-quality \
publication-ready graphics directly from MGL scripts embedded \
into your LaTeX document, using the MathGL library. Besides \
following the LaTeX philosophy of allowing you to concentrate \
on content rather than output (mglTeX takes care of producing \
the output), mglTeX facilitates the maintenance of your \
document, since both code for text and code for plots are \
contained in a single file. MathGL. is a fast and efficient \
library by Alexey Balakin for the creation of high-quality \
publication-ready scientific graphics. Although it defines \
interfaces for many programming languages, it also implements \
its own scripting language, called MGL, which can be used \
independently."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.4.2svn63255"

RPM_NAME = "texlive-mgltex-2023.201.4.2svn63255-54.1.noarch.rpm"
RPM_HASH = "3e77678d3d2fe10a89ae598c99552e4f9aaa178c3d018c56f3533c793effa05069fc7153ae32c9f21fad3e724eb0943f1644b0eb09b00d65619ae183764a821a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathgl-tex \
tex-mgltex.sty \
texlive-mgltex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-keyval.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
