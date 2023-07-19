SUMMARY = "Allow rendering latex in python310-matplotlib"
DESCRIPTION = "This package allows python310-matplotlib to display latex in plots \
and figures."
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-latex-3.6.3-3.1.noarch.rpm"
RPM_HASH = "03dc5de4823ee5e50dd81b1d8bbbd1d449d83d3e7d733c33f862df0bdcfda6628d6b8cd09b920edf47841c0b8cc73c653b97950f1896ba7c1bc8b5e086ee1cc1"
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
