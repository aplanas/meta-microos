SUMMARY = "Allow rendering latex in python39-matplotlib"
DESCRIPTION = "This package allows python39-matplotlib to display latex in plots \
and figures."
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-latex-3.6.3-2.3.noarch.rpm"
RPM_HASH = "354606217f19153c8915f0376b71bc52e4fc06f0f3a492dbccdebff23f3c0b537f78a1e98f94bbe19066c100ffaeef1a94dd65424bcdb66a510965970f893263"
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
