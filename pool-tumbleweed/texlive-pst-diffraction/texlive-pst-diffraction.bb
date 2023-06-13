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

PV = "2023.201.2.03svn62977"

RPM_NAME = "texlive-pst-diffraction-2023.201.2.03svn62977-52.1.noarch.rpm"
RPM_HASH = "6bf46321598d1ed23249fb7338fbe8b74b8ca292e1b5da16409033e244aa37d601857b3578f078dd5d04404c8060f68a2a721d2fadeaee17fec88910eee17997"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-diffraction.sty) \
tex(pst-diffraction.tex) \
texlive-pst-diffraction"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pst-3dplot.sty) \
tex(pst-xkey.sty) \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
