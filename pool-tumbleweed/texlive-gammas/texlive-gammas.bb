SUMMARY = "Template for the GAMM Archive for Students"
DESCRIPTION = "This is the official document class for typesetting journal \
articles for GAMM Archive for Students (GAMMAS), the \
open-access online yournal run by the GAMM Juniors (GAMM = \
Gesellschaft fur angewandte Mathematik und Mechanik)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn56403"

RPM_NAME = "texlive-gammas-2023.209.1.1svn56403-53.1.noarch.rpm"
RPM_HASH = "058799a12fa18126733a02926bd1bf15da3554c7a1d7c1cdd572cc7c13141bf95e5db183e368d64cdc33479cf7c83e2cb1f81253b8eda6ee6d5078b0da95147f"
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
