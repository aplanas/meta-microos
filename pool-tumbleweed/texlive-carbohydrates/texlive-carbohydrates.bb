SUMMARY = "Carbohydrate molecules with chemfig"
DESCRIPTION = "This package offers macros that make the preparation of \
exercise sheets for teaching carbohydrate chemistry a lot less \
tedious. It uses chemfig for drawing the formulas. Different \
representation models (Fischer, Haworth, chair...) are \
supported as well as alpha, beta, and chain isomers."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn39000"

RPM_NAME = "texlive-carbohydrates-2023.201.0.0.1svn39000-52.1.noarch.rpm"
RPM_HASH = "8a3fea8b0b894630e04d369849533c22a2277ed0631bd9cbbd679b518a85db5605eaf75daf47184120297971a99b3ab26291480aeb9d375a90c6ec721730e06e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(carbohydrates.sty) \
texlive-carbohydrates"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(chemfig.sty) \
tex(etoolbox.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
