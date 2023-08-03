SUMMARY = "Typeset crystallographic group-subgroup-schemes"
DESCRIPTION = "The package simplifies typesetting of simple crystallographic \
group-subgroup-schemes in the Barnighausen formalism. It \
defines a new environment stammbaum, wherein all elements of \
the scheme are defined. Afterwards all necessary dimensions are \
calculated and the scheme is drawn. Currently two steps of \
symmetry reduction are supported."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-gu-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "f960713bce59ddd2d04d660fd06490331e7c4cb30303f3df32c028a00f2e3fb3c6856ca52fe0c4e1ea9422a564299dc845838f2a5c141b45ec7bd11518057206"
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
