SUMMARY = "Class for typesetting articles for the ICSV conference"
DESCRIPTION = "This is an ad-hoc class for typesetting articles for the ICSV \
conference, based on the earler active-conf by the same author."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-icsv-2023.209.0.0.2svn15878-54.1.noarch.rpm"
RPM_HASH = "e0d410aaa83c3b957d672b8a65b133e4a54cf6f8b81929cfe450b5406a571664780a1876e223447cd9f7d69a33f5b585f077ed911a97f9d29d25c7171c3df611"
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
