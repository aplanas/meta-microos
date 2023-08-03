SUMMARY = "A dissertation class"
DESCRIPTION = "The class was developed to typeset a dissertation at ETH \
Zurich. The requirements were to use A5 paper and 10pt type. A \
sample of the output is shown in the PDF documentation link."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-hpsdiss-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "81a8dedd543a6414862645948f8fb62aba53b0a524a8d988ead2f6e8450a6d80f8e41cfb69a2be581611105b654b07701ddedf4947844899032320041924a5fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hpsdiss.cls \
texlive-hpsdiss"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-calc.sty \
tex-colordvi.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-mparhack.sty \
tex-ragged2e.sty \
tex-rotating.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
