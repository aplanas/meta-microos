SUMMARY = "A thesis class for the FCAV/UNESP (Brazil)"
DESCRIPTION = "This package provides a class and a bibliography style for the \
FCAV-UNESP (Faculdade de Ciencias Agrarias e Veterinarias de \
Jaboticabal UNESP) brazilian university, written based on the \
institution rules for thesis publications."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn38074"

RPM_NAME = "texlive-fcavtex-2023.201.1.1svn38074-52.1.noarch.rpm"
RPM_HASH = "922f44ea43ad3baaaf906c6d2e03079ad61de47476414fb5621f72ee77886eda5d933f261dbe26febb98046b381f8cd0e764b39fcd2091fd08b785ec4de26f39"
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
