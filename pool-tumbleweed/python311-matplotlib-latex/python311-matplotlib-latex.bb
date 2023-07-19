SUMMARY = "Allow rendering latex in python311-matplotlib"
DESCRIPTION = "This package allows python311-matplotlib to display latex in plots \
and figures."
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-latex-3.6.3-3.1.noarch.rpm"
RPM_HASH = "5e566ce7a7373ec6a5788e52b4422f2e23ab1110b1ab3ce472e4e353d19abad6a30a24721eb6d5d8bdad942246a895fa26a78c7155b9694062fa8fdaf9bdea5b"
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
