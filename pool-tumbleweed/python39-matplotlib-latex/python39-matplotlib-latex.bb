SUMMARY = "Allow rendering latex in python39-matplotlib"
DESCRIPTION = "This package allows python39-matplotlib to display latex in plots \
and figures."
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-latex-3.6.3-3.1.noarch.rpm"
RPM_HASH = "ace75cf2a6aa5b28bdc74fd90100235ef597a9ff3f05389bf6fd6058faab27c1ebd026bac943757e6337e597bd6fef99381911bfd5c0b7cdbb93e249fabf764a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-matplotlib-latex"

RDEPENDS:${PN} += "python39-matplotlib \
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
