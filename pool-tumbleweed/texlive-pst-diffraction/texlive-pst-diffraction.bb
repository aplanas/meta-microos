SUMMARY = "Print diffraction patterns from various apertures"
DESCRIPTION = "The package enables the user to draw (using PSTricks) the \
diffraction patterns for different geometric forms of apertures \
for monochromatic light (using PSTricks). The aperture stops \
can have rectangular, circular or triangular openings. The view \
of the diffraction may be planar, or three-dimensional. Options \
available are the dimensions of the aperture under \
consideration and of the particular optical setting, e.g. the \
radius in case of an circular opening. Moreover one can choose \
the wavelength of the light (the associated color will be \
calculated by the package)."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.03svn62977"

RPM_NAME = "texlive-pst-diffraction-2023.209.2.03svn62977-53.1.noarch.rpm"
RPM_HASH = "b8722e65cb1b9f51898d73445677eb95b0626b6acd9403a34a23b19ded035647a9611f9fb87a90afed91e111790ba3ae04ca3858fe78190ecbcb9c9568a76290"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-diffraction.sty \
tex-pst-diffraction.tex \
texlive-pst-diffraction"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-3dplot.sty \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
