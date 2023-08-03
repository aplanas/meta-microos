SUMMARY = "Carbohydrate molecules with chemfig"
DESCRIPTION = "This package offers macros that make the preparation of \
exercise sheets for teaching carbohydrate chemistry a lot less \
tedious. It uses chemfig for drawing the formulas. Different \
representation models (Fischer, Haworth, chair...) are \
supported as well as alpha, beta, and chain isomers."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn39000"

RPM_NAME = "texlive-carbohydrates-2023.209.0.0.1svn39000-53.1.noarch.rpm"
RPM_HASH = "510a539746086bd25f222254dadb637aadc39a2d6df2a314430329e90f659e063988575612b3071a74821178421b19edbb6aa8043c41682fc0a0ca6b1570837c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-carbohydrates.sty \
texlive-carbohydrates"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-chemfig.sty \
tex-etoolbox.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
