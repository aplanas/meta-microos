SUMMARY = "Thesis class for UESTC"
DESCRIPTION = "The class is for typesetting a thesis at the University of \
Electronic Science and Technology of China."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn36371"

RPM_NAME = "texlive-uestcthesis-2023.209.1.1.0svn36371-54.1.noarch.rpm"
RPM_HASH = "c50f4f10f3d764c488039d98e5bdd243de3051ecbe42ab57709be4ab4cedf94172b935add28529ba53cdafb58c980b5fe0d1197a40e94bbc4c971243c613b412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uestcthesis.cls \
texlive-uestcthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-bm.sty \
tex-booktabs.sty \
tex-calc.sty \
tex-caption.sty \
tex-cmap.sty \
tex-color.sty \
tex-ctexbook.cls \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-flafter.sty \
tex-float.sty \
tex-footmisc.sty \
tex-glossaries.sty \
tex-graphicx.sty \
tex-hyperxmp.sty \
tex-ifthen.sty \
tex-longtable.sty \
tex-marvosym.sty \
tex-mathptmx.sty \
tex-multibib.sty \
tex-natbib.sty \
tex-ntheorem.sty \
tex-pifont.sty \
tex-placeins.sty \
tex-subfigure.sty \
tex-tabularx.sty \
tex-texnames.sty \
tex-threeparttable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
