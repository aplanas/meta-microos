SUMMARY = "A thesis class for the FCAV/UNESP (Brazil)"
DESCRIPTION = "This package provides a class and a bibliography style for the \
FCAV-UNESP (Faculdade de Ciencias Agrarias e Veterinarias de \
Jaboticabal UNESP) brazilian university, written based on the \
institution rules for thesis publications."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn38074"

RPM_NAME = "texlive-fcavtex-2023.209.1.1svn38074-53.1.noarch.rpm"
RPM_HASH = "4fd33ae74c4fbf4cb015c400aae5333aacdd7a7aae445b1e07adaeb4da802edb4db87b6dc1abb28226b0c1b2e8f0fa9da9af173f81ed14f2a652bacbe1f6ffba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fcavtex.cls \
texlive-fcavtex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-abntex2cite.sty \
tex-babel.sty \
tex-chapterbib.sty \
tex-geometry.sty \
tex-helvet.sty \
tex-hyperref.sty \
tex-hyphenat.sty \
tex-incgraph.sty \
tex-indentfirst.sty \
tex-inputenc.sty \
tex-layout.sty \
tex-memhfixc.sty \
tex-memoir.cls \
tex-mfirstuc.sty \
tex-microtype.sty \
tex-pageslts.sty \
tex-paralist.sty \
tex-ragged2e.sty \
tex-sfmath.sty \
tex-textpos.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-tocloft.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
