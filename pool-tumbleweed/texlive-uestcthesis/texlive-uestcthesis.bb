SUMMARY = "Thesis class for UESTC"
DESCRIPTION = "The class is for typesetting a thesis at the University of \
Electronic Science and Technology of China."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0svn36371"

RPM_NAME = "texlive-uestcthesis-2023.201.1.1.0svn36371-53.1.noarch.rpm"
RPM_HASH = "fccca9326404056c18034a7daf8d9734b15c2a7c9a692292ac80ed40d7fca63ed318d1bdef21dbaf5d33f5c78f6ea4d7a21e48c7b5b0ee6a6dcf92acff364d0f"
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
