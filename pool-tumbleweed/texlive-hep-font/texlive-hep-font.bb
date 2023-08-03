SUMMARY = "Latin modern extended by computer modern"
DESCRIPTION = "The hep-font package loads standard font packages and extends \
the usual Latin Modern implementations by replacing missing \
fonts with Computer Modern counterparts. The package is loaded \
with \\usepackage{hep-font}."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64900"

RPM_NAME = "texlive-hep-font-2023.209.1.1svn64900-54.1.noarch.rpm"
RPM_HASH = "f2d7eebad7a39a14041bf26ace422d248cd8d1328fef3da0e2029614d4f5476e4c8251a6c8ef9004e194d93d3055ea73aea01c32d17c328cb7b7b987d7a991b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-font.sty \
texlive-hep-font"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cfr-lm.sty \
tex-fix-cm.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-kvoptions.sty \
tex-lmodern.sty \
tex-microtype.sty \
tex-nfssext-cfr.sty \
tex-pdftexcmds.sty \
tex-slantsc.sty \
tex-textcomp.sty \
tex-units.sty \
tex-xparse.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
