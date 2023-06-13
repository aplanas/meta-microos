SUMMARY = "PSTricks"
DESCRIPTION = "PSTricks core and all add-on packages."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn65367"

RPM_NAME = "texlive-collection-pstricks-2023.208.svn65367-58.1.noarch.rpm"
RPM_HASH = "389271fa7d70a83e4e9c68ef84b27c00e1ce585e5fc853e42264216c36cf36875fe90af46330bd6aa267bfa6f90313469d417439e942142e27c0585591c6c976"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pstricks) \
texlive-collection-pstricks"

RDEPENDS:${PN} += "texlive-auto-pst-pdf \
texlive-bclogo \
texlive-collection-basic \
texlive-collection-plaingeneric \
texlive-dsptricks \
texlive-luapstricks \
texlive-makeplot \
texlive-pdftricks \
texlive-pdftricks2 \
texlive-pedigree-perl \
texlive-psbao \
texlive-pst-2dplot \
texlive-pst-3d \
texlive-pst-3dplot \
texlive-pst-abspos \
texlive-pst-am \
texlive-pst-antiprism \
texlive-pst-arrow \
texlive-pst-asr \
texlive-pst-bar \
texlive-pst-barcode \
texlive-pst-bezier \
texlive-pst-blur \
texlive-pst-bspline \
texlive-pst-calculate \
texlive-pst-calendar \
texlive-pst-cie \
texlive-pst-circ \
texlive-pst-coil \
texlive-pst-contourplot \
texlive-pst-cox \
texlive-pst-dart \
texlive-pst-dbicons \
texlive-pst-diffraction \
texlive-pst-electricfield \
texlive-pst-eps \
texlive-pst-eucl \
texlive-pst-exa \
texlive-pst-feyn \
texlive-pst-fill \
texlive-pst-fit \
texlive-pst-flags \
texlive-pst-fr3d \
texlive-pst-fractal \
texlive-pst-fun \
texlive-pst-func \
texlive-pst-gantt \
texlive-pst-geo \
texlive-pst-geometrictools \
texlive-pst-gr3d \
texlive-pst-grad \
texlive-pst-graphicx \
texlive-pst-hsb \
texlive-pst-infixplot \
texlive-pst-intersect \
texlive-pst-jtree \
texlive-pst-knot \
texlive-pst-labo \
texlive-pst-layout \
texlive-pst-lens \
texlive-pst-light3d \
texlive-pst-lsystem \
texlive-pst-magneticfield \
texlive-pst-marble \
texlive-pst-math \
texlive-pst-mirror \
texlive-pst-moire \
texlive-pst-node \
texlive-pst-ob3d \
texlive-pst-ode \
texlive-pst-optexp \
texlive-pst-optic \
texlive-pst-osci \
texlive-pst-ovl \
texlive-pst-pad \
texlive-pst-pdf \
texlive-pst-pdgr \
texlive-pst-perspective \
texlive-pst-platon \
texlive-pst-plot \
texlive-pst-poker \
texlive-pst-poly \
texlive-pst-pulley \
texlive-pst-qtree \
texlive-pst-rputover \
texlive-pst-rubans \
texlive-pst-shell \
texlive-pst-sigsys \
texlive-pst-slpe \
texlive-pst-solarsystem \
texlive-pst-solides3d \
texlive-pst-soroban \
texlive-pst-spectra \
texlive-pst-spinner \
texlive-pst-stru \
texlive-pst-support \
texlive-pst-text \
texlive-pst-thick \
texlive-pst-tools \
texlive-pst-tree \
texlive-pst-turtle \
texlive-pst-tvz \
texlive-pst-uml \
texlive-pst-vectorian \
texlive-pst-vehicle \
texlive-pst-venn \
texlive-pst-vowel \
texlive-pst2pdf \
texlive-pstricks \
texlive-pstricks-add \
texlive-pstricks_calcnotes \
texlive-uml \
texlive-vaucanson-g \
texlive-vocaltract"

inherit rpm
