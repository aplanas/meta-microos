SUMMARY = "Figures which fill up a whole page"
DESCRIPTION = "This package defines a figure environment which provides the \
figure content on its own page, with the corresponding caption \
reading for example 'Figure 3 (on next page): <caption>'."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn41857"

RPM_NAME = "texlive-phffullpagefigure-2023.209.1.0svn41857-52.1.noarch.rpm"
RPM_HASH = "cf0dfbfef4f2bc11e8c1208c361bcdecba65b0f33da32031d13940d2b34189ee32433e91603db0380ee2ee2b14cb909fc4013d6a2c2d3351f4e0e7d5cfc109ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phffullpagefigure.sty \
texlive-phffullpagefigure"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-etoolbox.sty \
tex-ifoddpage.sty \
tex-pdfpages.sty \
tex-placeins.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
