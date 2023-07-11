SUMMARY = "A basis for books to be published by Mentis publishers"
DESCRIPTION = "This LaTeX class loads scrbook and provides changes necessary \
for publishing at Mentis publishers in Paderborn, Germany. It \
is not an official Mentis class, merely one developed by an \
author in close co-operation with Mentis."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.5svn15878"

RPM_NAME = "texlive-mentis-2023.208.1.5svn15878-53.1.noarch.rpm"
RPM_HASH = "9359ab809203c6c7b19357b734056e1ba3e13364b46f0ab76ee358149350ba21de4cde1569cf4f4b0ad9ab489b2c2dcdd34bfe5df02cb33dfdab3217db3c85ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mentis.cls \
texlive-mentis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-jurabib.sty \
tex-makeidx.sty \
tex-microtype.sty \
tex-multicol.sty \
tex-ragged2e.sty \
tex-relsize.sty \
tex-textcomp.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
