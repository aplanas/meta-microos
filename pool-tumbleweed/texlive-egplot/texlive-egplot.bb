SUMMARY = "Encapsulate Gnuplot sources in LaTeX documents"
DESCRIPTION = "A package to encapsulate gnuplot commands in a LaTeX source \
file, so that a document's figures are maintained in parallel \
with the document source itself."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.02asvn20617"

RPM_NAME = "texlive-egplot-2023.201.1.02asvn20617-53.2.noarch.rpm"
RPM_HASH = "3b72a5c03f885ad305be8325c3bcbd3d7672a5243edc8fa4d4466c5f9d41b1ec335e44a928fe1cb63bcbaa596d615b5392fc18355d0f6b06f564643c226d1b68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-egplot.sty \
texlive-egplot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-ifthen.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
