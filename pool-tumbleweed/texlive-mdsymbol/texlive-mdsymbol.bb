SUMMARY = "Symbol fonts to match Adobe Myriad Pro"
DESCRIPTION = "The package provides a font of mathematical symbols, MyriadPro \
The font is designed as a companion to Adobe Myriad Pro, but it \
might also fit well with other contemporary typefaces."
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.5svn28399"

RPM_NAME = "texlive-mdsymbol-2023.201.0.0.5svn28399-52.1.noarch.rpm"
RPM_HASH = "23bd3eaca24caa28a519c271dd5937ab4ff3979badc03ae6b536895fdf0814cb2f4d6ed4c0fb664b96e9a684969e7e0ec6519eaa1cdc7d3dae854256bbe2bc53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-MdSymbolA-Bold.tfm \
tex-MdSymbolA-Light.tfm \
tex-MdSymbolA-Regular.tfm \
tex-MdSymbolA-Semibold.tfm \
tex-MdSymbolB-Bold.tfm \
tex-MdSymbolB-Light.tfm \
tex-MdSymbolB-Regular.tfm \
tex-MdSymbolB-Semibold.tfm \
tex-MdSymbolC-Bold.tfm \
tex-MdSymbolC-Light.tfm \
tex-MdSymbolC-Regular.tfm \
tex-MdSymbolC-Semibold.tfm \
tex-MdSymbolD-Bold.tfm \
tex-MdSymbolD-Light.tfm \
tex-MdSymbolD-Regular.tfm \
tex-MdSymbolD-Semibold.tfm \
tex-MdSymbolE-Bold.tfm \
tex-MdSymbolE-Light.tfm \
tex-MdSymbolE-Regular.tfm \
tex-MdSymbolE-Semibold.tfm \
tex-MdSymbolF-Bold.tfm \
tex-MdSymbolF-Light.tfm \
tex-MdSymbolF-Regular.tfm \
tex-MdSymbolF-Semibold.tfm \
tex-mdsymbol-a.enc \
tex-mdsymbol-b.enc \
tex-mdsymbol-c.enc \
tex-mdsymbol-d.enc \
tex-mdsymbol-e.enc \
tex-mdsymbol-f.enc \
tex-mdsymbol.map \
tex-mdsymbol.sty \
texlive-mdsymbol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-calc.sty \
tex-etoolbox.sty \
tex-fltpoint.sty \
tex-textcomp.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mdsymbol-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
