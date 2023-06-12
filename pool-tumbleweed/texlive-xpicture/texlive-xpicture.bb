SUMMARY = "Extensions of LaTeX picture drawing"
DESCRIPTION = "The package extends the facilities of the pict2e and the \
curve2e packages, providing extra reference frames, conic \
section curves, graphs of elementary functions and other \
parametric curves."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn28770"

RPM_NAME = "texlive-xpicture-2023.201.1.2asvn28770-52.1.noarch.rpm"
RPM_HASH = "e5878b2e20c30a2f9c22ff3dfe8a29bf7772049203990497987b4198668b950a3939a2e624f4b608e8200f8724d17171c0f6f3e8adfadb67e7dd8bdf9775f75c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xpicture.sty) \
texlive-xpicture"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calculus.sty) \
tex(curve2e.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
