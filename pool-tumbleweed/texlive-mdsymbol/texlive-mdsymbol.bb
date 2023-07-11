SUMMARY = "Symbol fonts to match Adobe Myriad Pro"
DESCRIPTION = "The package provides a font of mathematical symbols, MyriadPro \
The font is designed as a companion to Adobe Myriad Pro, but it \
might also fit well with other contemporary typefaces."
LICENSE = "OFL-1.1"

PV = "2023.208.0.0.5svn28399"

RPM_NAME = "texlive-mdsymbol-2023.208.0.0.5svn28399-53.1.noarch.rpm"
RPM_HASH = "f597f7250d5fb0e2d484bfe3a0339ea3aaf595539168009b38d5c008cb1380e3a42914ace72383495b28c48c451bd8c7245ae9e6cb7bc18a046b39fbd38ac74a"
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
