SUMMARY = "Spherical mirrors and lenses in TikZ"
DESCRIPTION = "This package allows the automatic drawing of the image of \
objects in spherical mirrors and lenses from the data of the \
focus, from the position and height of the object. It \
calculates the position and height of the image, and also \
displays the notable rays."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn65500"

RPM_NAME = "texlive-tikz-mirror-lens-2023.201.1.0.2svn65500-52.1.noarch.rpm"
RPM_HASH = "cfc66908a13883abae5d86aca12bab131e5e6386bde8ecc5b13999b5bacc8e7dcf51dd60fde050c01a33cb12381bcfc8b2b7c48ea2aab0a57682b12651df4bb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikz-mirror-lens.sty) \
texlive-tikz-mirror-lens"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
