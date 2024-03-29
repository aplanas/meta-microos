SUMMARY = "Graphics, pictures, diagrams"
DESCRIPTION = "Including TikZ, pict, etc., but MetaPost and PStricks are \
separate."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn66360"

RPM_NAME = "texlive-collection-pictures-2023.208.svn66360-60.1.noarch.rpm"
RPM_HASH = "534b822ed456fb2dfb1e9654747db638e8551b2ae3db8cbbeb7bad28e05a1df376b2fc50455d2639e874f6085c6715f8f8f5e04e1c0242924b4c51aab8fb2e95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pictures \
texlive-collection-pictures"

RDEPENDS:${PN} += "texlive-adigraph \
texlive-aobs-tikz \
texlive-askmaps \
texlive-asyfig \
texlive-asypictureb \
texlive-autoarea \
texlive-bardiag \
texlive-beamerswitch \
texlive-binarytree \
texlive-blochsphere \
texlive-bloques \
texlive-blox \
texlive-bodegraph \
texlive-bondgraph \
texlive-bondgraphs \
texlive-braids \
texlive-bxeepic \
texlive-byo-twemojis \
texlive-byrne \
texlive-cachepic \
texlive-callouts \
texlive-celtic \
texlive-chemfig \
texlive-circuit-macros \
texlive-circuitikz \
texlive-coffeestains \
texlive-collection-basic \
texlive-combinedgraphics \
texlive-curve \
texlive-curve2e \
texlive-curves \
texlive-dcpic \
texlive-diagmac2 \
texlive-ditaa \
texlive-doc-pictex \
texlive-dot2texi \
texlive-dottex \
texlive-dpcircling \
texlive-dratex \
texlive-drs \
texlive-duotenzor \
texlive-dynkin-diagrams \
texlive-ecgdraw \
texlive-eepic \
texlive-ellipse \
texlive-endofproofwd \
texlive-epspdf \
texlive-epspdfconversion \
texlive-esk \
texlive-euflag \
texlive-fast-diagram \
texlive-fig4latex \
texlive-figchild \
texlive-figput \
texlive-fitbox \
texlive-flowchart \
texlive-forest \
texlive-genealogytree \
texlive-getmap \
texlive-gincltex \
texlive-gnuplottex \
texlive-gradientframe \
texlive-grafcet \
texlive-graph35 \
texlive-graphicxpsd \
texlive-graphviz \
texlive-gtrlib-largetrees \
texlive-harveyballs \
texlive-here \
texlive-hf-tikz \
texlive-hobby \
texlive-hvfloat \
texlive-istgame \
texlive-kblocks \
texlive-kinematikz \
texlive-knitting \
texlive-knittingpattern \
texlive-ladder \
texlive-lapdf \
texlive-latex-make \
texlive-liftarm \
texlive-lpic \
texlive-lroundrect \
texlive-luamesh \
texlive-luasseq \
texlive-maker \
texlive-makeshape \
texlive-mathspic \
texlive-mercatormap \
texlive-milsymb \
texlive-miniplot \
texlive-mkpic \
texlive-modiagram \
texlive-neuralnetwork \
texlive-nl-interval \
texlive-nndraw \
texlive-numericplots \
texlive-outilsgeomtikz \
texlive-pb-diagram \
texlive-penrose \
texlive-petri-nets \
texlive-pgf \
texlive-pgf-blur \
texlive-pgf-interference \
texlive-pgf-periodictable \
texlive-pgf-pie \
texlive-pgf-soroban \
texlive-pgf-spectra \
texlive-pgf-umlcd \
texlive-pgf-umlsd \
texlive-pgfgantt \
texlive-pgfkeyx \
texlive-pgfmolbio \
texlive-pgfmorepages \
texlive-pgfopts \
texlive-pgfornament \
texlive-pgfplots \
texlive-picinpar \
texlive-pict2e \
texlive-pictex \
texlive-pictex2 \
texlive-pinlabel \
texlive-pixelart \
texlive-pixelarttikz \
texlive-pmgraph \
texlive-postage \
texlive-prerex \
texlive-productbox \
texlive-ptolemaicastronomy \
texlive-puyotikz \
texlive-pxpgfmark \
texlive-pxpic \
texlive-qcircuit \
texlive-qrcode \
texlive-quantikz \
texlive-randbild \
texlive-randomwalk \
texlive-realhats \
texlive-reotex \
texlive-robotarm \
texlive-rviewport \
texlive-sa-tikz \
texlive-sacsymb \
texlive-schemabloc \
texlive-scratch \
texlive-scratch3 \
texlive-scsnowman \
texlive-setdeck \
texlive-signchart \
texlive-simplenodes \
texlive-simpleoptics \
texlive-smartdiagram \
texlive-spath3 \
texlive-spectralsequences \
texlive-strands \
texlive-swimgraf \
texlive-syntaxdi \
texlive-table-fct \
texlive-texdraw \
texlive-ticollege \
texlive-tikz-3dplot \
texlive-tikz-among-us \
texlive-tikz-bagua \
texlive-tikz-bayesnet \
texlive-tikz-bbox \
texlive-tikz-cd \
texlive-tikz-dependency \
texlive-tikz-dimline \
texlive-tikz-ext \
texlive-tikz-feynhand \
texlive-tikz-feynman \
texlive-tikz-imagelabels \
texlive-tikz-inet \
texlive-tikz-kalender \
texlive-tikz-karnaugh \
texlive-tikz-ladder \
texlive-tikz-lake-fig \
texlive-tikz-layers \
texlive-tikz-mirror-lens \
texlive-tikz-nef \
texlive-tikz-network \
texlive-tikz-opm \
texlive-tikz-optics \
texlive-tikz-page \
texlive-tikz-palattice \
texlive-tikz-planets \
texlive-tikz-qtree \
texlive-tikz-relay \
texlive-tikz-sfc \
texlive-tikz-swigs \
texlive-tikz-timing \
texlive-tikz-trackschematic \
texlive-tikz-truchet \
texlive-tikzbricks \
texlive-tikzcodeblocks \
texlive-tikzducks \
texlive-tikzfill \
texlive-tikzinclude \
texlive-tikzlings \
texlive-tikzmark \
texlive-tikzmarmots \
texlive-tikzorbital \
texlive-tikzpackets \
texlive-tikzpagenodes \
texlive-tikzpeople \
texlive-tikzpfeile \
texlive-tikzpingus \
texlive-tikzposter \
texlive-tikzscale \
texlive-tikzsymbols \
texlive-tikztosvg \
texlive-tikzviolinplots \
texlive-tile-graphic \
texlive-timing-diagrams \
texlive-tipfr \
texlive-tkz-base \
texlive-tkz-berge \
texlive-tkz-doc \
texlive-tkz-euclide \
texlive-tkz-fct \
texlive-tkz-graph \
texlive-tkz-orm \
texlive-tkz-tab \
texlive-tkzexample \
texlive-tonevalue \
texlive-tqft \
texlive-tsemlines \
texlive-tufte-latex \
texlive-twemojis \
texlive-tzplot \
texlive-utfsym \
texlive-venndiagram \
texlive-visualpstricks \
texlive-wheelchart \
texlive-worldflags \
texlive-xistercian \
texlive-xpicture \
texlive-xypic"

inherit rpm
