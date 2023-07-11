SUMMARY = "Allow rendering latex in python310-matplotlib"
DESCRIPTION = "This package allows python310-matplotlib to display latex in plots \
and figures."
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-latex-3.6.3-2.3.noarch.rpm"
RPM_HASH = "963354a18699a599ca62742fc4d09192a742993acd5ea81b27673f044716482811cb66faf3a23be8814aecd5dae0bdb483a72e556fba287d65b2a270bdd8246c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-matplotlib-latex"

RDEPENDS:${PN} += "python310-matplotlib \
tex-avant.sty \
tex-chancery.sty \
tex-charter.sty \
tex-courier.sty \
tex-geometry.sty \
tex-helvet.sty \
tex-mathpazo.sty \
tex-mathptmx.sty \
tex-pncr.tfm \
tex-psfrag.sty \
tex-type1cm.sty \
tex-type1ec.sty \
tex-ucs.sty \
tex-underscore.sty \
texlive-dvipng \
texlive-dvips \
texlive-geometry \
texlive-graphics \
texlive-helvetic \
texlive-latex \
texlive-pgf \
texlive-sfmath \
texlive-tex \
texlive-txfonts \
texlive-xcolor"

inherit rpm
