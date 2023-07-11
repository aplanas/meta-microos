SUMMARY = "MetaPost and Metafont packages"
DESCRIPTION = "The collection-metapost package"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn64878"

RPM_NAME = "texlive-collection-metapost-2023.208.svn64878-60.1.noarch.rpm"
RPM_HASH = "b115fefbbd79b675425d86ba655c4c3e36b5b16a58516bc74179b4c3552012067ef4276d10d4eaa725afcbf3616bd677b663a577bab10819e1f1e2b8ae484cc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-metapost \
texlive-collection-metapost"

RDEPENDS:${PN} += "texlive-automata \
texlive-bbcard \
texlive-blockdraw-mp \
texlive-bpolynomial \
texlive-cmarrows \
texlive-collection-basic \
texlive-drv \
texlive-dviincl \
texlive-emp \
texlive-epsincl \
texlive-expressg \
texlive-exteps \
texlive-featpost \
texlive-feynmf \
texlive-feynmp-auto \
texlive-fiziko \
texlive-garrigues \
texlive-gmp \
texlive-hatching \
texlive-hershey-mp \
texlive-latexmp \
texlive-mcf2graph \
texlive-metago \
texlive-metaobj \
texlive-metaplot \
texlive-metapost \
texlive-metapost-colorbrewer \
texlive-metauml \
texlive-mfpic \
texlive-mfpic4ode \
texlive-minim-hatching \
texlive-mp3d \
texlive-mparrows \
texlive-mpattern \
texlive-mpcolornames \
texlive-mpgraphics \
texlive-mptrees \
texlive-piechartmp \
texlive-repere \
texlive-roex \
texlive-roundrect \
texlive-shapes \
texlive-slideshow \
texlive-splines \
texlive-suanpan \
texlive-textpath \
texlive-threeddice"

inherit rpm
