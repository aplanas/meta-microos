SUMMARY = "Allow rendering latex in python39-matplotlib"
DESCRIPTION = "This package allows python39-matplotlib to display latex in plots \
and figures."
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-latex-3.6.3-2.1.noarch.rpm"
RPM_HASH = "d223e1a81d18535f1d9c6450ba7cda069c729eed9a1867f19907e29175376020d80c225318cda5473d287eaacd4a33c671fcda2843823b57ff5428f4e2519084"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-matplotlib-latex"
RDEPENDS:${PN} += "python39-matplotlib \
tex(avant.sty) \
tex(chancery.sty) \
tex(charter.sty) \
tex(courier.sty) \
tex(geometry.sty) \
tex(helvet.sty) \
tex(mathpazo.sty) \
tex(mathptmx.sty) \
tex(pncr.tfm) \
tex(psfrag.sty) \
tex(type1cm.sty) \
tex(type1ec.sty) \
tex(ucs.sty) \
tex(underscore.sty) \
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
