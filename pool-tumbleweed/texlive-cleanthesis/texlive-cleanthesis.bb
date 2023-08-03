SUMMARY = "A clean LaTeX style for thesis documents"
DESCRIPTION = "The package offers a clean, simple, and elegant LaTeX style for \
thesis documents."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.0svn51472"

RPM_NAME = "texlive-cleanthesis-2023.209.0.0.4.0svn51472-54.1.noarch.rpm"
RPM_HASH = "ad73b900e5c7ab593030410bdffb9942190706c10041debf5237639eb2b5ff3a5002c179101c8fb344a7b39160f6a71320edc23963578a8522ea31308b30dbf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cleanthesis.sty \
texlive-cleanthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-blindtext.sty \
tex-charter.sty \
tex-enumitem.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-listings.sty \
tex-lmodern.sty \
tex-microtype.sty \
tex-scrlayer-scrpage.sty \
tex-setspace.sty \
tex-tabularx.sty \
tex-textcomp.sty \
tex-tgheros.sty \
tex-tocloft.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
