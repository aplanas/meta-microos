SUMMARY = "Typeset crystallographic group-subgroup-schemes"
DESCRIPTION = "The package simplifies typesetting of simple crystallographic \
group-subgroup-schemes in the Barnighausen formalism. It \
defines a new environment stammbaum, wherein all elements of \
the scheme are defined. Afterwards all necessary dimensions are \
calculated and the scheme is drawn. Currently two steps of \
symmetry reduction are supported."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-gu-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "abca2dca1e5188313b4cb8cdbc5bc5bb4cc9998e3f1252d67b1bb4f60445c54c35edf7ca7739401f5d92a49e125f99ecb7c050304156a0dd1bfe598886aea863"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gu.sty \
texlive-gu"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-calc.sty \
tex-fp.sty \
tex-ifthen.sty \
tex-pict2e.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
