SUMMARY = "Extended Greek and sans-serif math"
DESCRIPTION = "The hep-math-font package adjust the math fonts to be \
sans-serif if the document is sans-serif. Additionally Greek \
letters are redefined to be always italic and upright in math \
and text mode respectively. Some math font macros are adjusted \
to give more consistently the naively expected results. The \
package is loaded with \\usepackage{hep-math-font}."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64901"

RPM_NAME = "texlive-hep-math-font-2023.201.1.1svn64901-53.2.noarch.rpm"
RPM_HASH = "2f27067ecdc6b3c0258d3d3c86e7ebb2dbb28b333dd2fde94b8167b41c47889c35ce576c522db23fe2830f29cbd33424da16aecb3b0e700ff7bb905b6be46e37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-math-font.sty \
texlive-hep-math-font"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-MnSymbol.sty \
tex-amssymb.sty \
tex-amstext.sty \
tex-bm.sty \
tex-exscale.sty \
tex-fixmath.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-kvoptions.sty \
tex-pdftexcmds.sty \
tex-substitutefont.sty \
tex-textalpha.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
