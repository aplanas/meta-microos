SUMMARY = "Template for the GAMM Archive for Students"
DESCRIPTION = "This is the official document class for typesetting journal \
articles for GAMM Archive for Students (GAMMAS), the \
open-access online yournal run by the GAMM Juniors (GAMM = \
Gesellschaft fur angewandte Mathematik und Mechanik)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn56403"

RPM_NAME = "texlive-gammas-2023.201.1.1svn56403-52.1.noarch.rpm"
RPM_HASH = "2c0c51062bf4a0badf6a6da23b6358119af39c969beb738330b106f7b0017ac5fb85797cf2274b86c9f2192a32b40e49a4488d6026aa4b2bc000507bb04f28f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gammas.cls \
texlive-gammas"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-anyfontsize.sty \
tex-babel.sty \
tex-biblatex.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-cleveref.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-fontenc.sty \
tex-fourier.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-lineno.sty \
tex-listings.sty \
tex-lmodern.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-microtype.sty \
tex-natbib.sty \
tex-pgfplots.sty \
tex-scrartcl.cls \
tex-scrlayer-scrpage.sty \
tex-siunitx.sty \
tex-subdepth.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
