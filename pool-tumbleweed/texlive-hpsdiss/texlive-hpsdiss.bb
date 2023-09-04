SUMMARY = "A dissertation class"
DESCRIPTION = "The class was developed to typeset a dissertation at ETH \
Zurich. The requirements were to use A5 paper and 10pt type. A \
sample of the output is shown in the PDF documentation link."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-hpsdiss-2023.209.1.0svn15878-54.2.noarch.rpm"
RPM_HASH = "6d0959a3ee9617b5b9f6af7772b00cebc04fbe81fa542eef4b117056ecf30e27939d1398507dc131ef241d488c946511e1c21b2d97fce45a92041860a6391dd3"
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
