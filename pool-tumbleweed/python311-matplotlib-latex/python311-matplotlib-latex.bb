SUMMARY = "Allow rendering latex in python311-matplotlib"
DESCRIPTION = "This package allows python311-matplotlib to display latex in plots \
and figures."
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-latex-3.6.3-2.3.noarch.rpm"
RPM_HASH = "5d88fe07b7f2216df3bab5fdeb5103e78c34da9bcf1a76272bf2fe145dda5bb977aea95be68c767dc428038ae3b7c2cea3cd88df8d2dc8a130d5ebb130e8e35c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-matplotlib-latex \
python311-matplotlib-latex"

RDEPENDS:${PN} += "python311-matplotlib \
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
