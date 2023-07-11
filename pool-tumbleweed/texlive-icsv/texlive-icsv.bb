SUMMARY = "Class for typesetting articles for the ICSV conference"
DESCRIPTION = "This is an ad-hoc class for typesetting articles for the ICSV \
conference, based on the earler active-conf by the same author."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.2svn15878"

RPM_NAME = "texlive-icsv-2023.208.0.0.2svn15878-53.1.noarch.rpm"
RPM_HASH = "53b566735e18f5ccaa78b1b33869d34a3645ee22758ba2dee2c356d83e0b366d080983ab47f5b9c65a4e92100c5356b95aeb71ccd2b8136d589e1b00c3029916"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-icsv.cls \
texlive-icsv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-array.sty \
tex-article.cls \
tex-bm.sty \
tex-calc.sty \
tex-caption.sty \
tex-fancyhdr.sty \
tex-fix-cm.sty \
tex-fixltx2e.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-textcomp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
