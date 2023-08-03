SUMMARY = "Filling with colour gradients, using PSTricks"
DESCRIPTION = "The package fills with colour gradients, using PSTricks. The \
RGB, CMYK and HSB models are supported. Other colour gradient \
mechanisms are to be found in package pst-slpe."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.06svn15878"

RPM_NAME = "texlive-pst-grad-2023.209.1.06svn15878-53.1.noarch.rpm"
RPM_HASH = "fa070120c0f91b3f341ff5231f724a25b6c21f63a244a6b461cab648ad0d18ebb02ba38e1e91800756e1e4247f67328cc2589719efdd2bad3b23d7213f861236"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-grad.sty \
tex-pst-grad.tex \
texlive-pst-grad"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
