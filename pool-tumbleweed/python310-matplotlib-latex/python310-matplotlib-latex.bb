SUMMARY = "Allow rendering latex in python310-matplotlib"
DESCRIPTION = "This package allows python310-matplotlib to display latex in plots \
and figures."
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-latex-3.6.3-2.1.noarch.rpm"
RPM_HASH = "6e70d1a79c6858d38f71d2b11c1207dde45c86548b83c18999bb8f714d2fa1a1cb8b95ded853cff002770526e7ce63a67587d23123a12f8b56640885726b70a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-matplotlib-latex \
python310-matplotlib-latex"
RDEPENDS:${PN} += "python310-matplotlib \
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
