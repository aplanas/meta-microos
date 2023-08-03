SUMMARY = "Spherical mirrors and lenses in TikZ"
DESCRIPTION = "This package allows the automatic drawing of the image of \
objects in spherical mirrors and lenses from the data of the \
focus, from the position and height of the object. It \
calculates the position and height of the image, and also \
displays the notable rays."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn65500"

RPM_NAME = "texlive-tikz-mirror-lens-2023.209.1.0.2svn65500-53.1.noarch.rpm"
RPM_HASH = "b4d146d1648c3d20d0acdec6f972a71c521bba249285649be9a222b6a78a938b1eb20c5bcfc025d4300c9454d4181b770ef195980029949a1fdebe5d7478ab7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-mirror-lens.sty \
texlive-tikz-mirror-lens"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
