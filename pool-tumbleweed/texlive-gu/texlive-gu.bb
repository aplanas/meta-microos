SUMMARY = "Typeset crystallographic group-subgroup-schemes"
DESCRIPTION = "The package simplifies typesetting of simple crystallographic \
group-subgroup-schemes in the Barnighausen formalism. It \
defines a new environment stammbaum, wherein all elements of \
the scheme are defined. Afterwards all necessary dimensions are \
calculated and the scheme is drawn. Currently two steps of \
symmetry reduction are supported."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-gu-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "7b304a544e365a1c3d2eac81c3b03febda8efe02e50291fe69ed7d00d7a4940c0866ef4548f519ffc77208b866926288038cdfb96e9de9188a8b0cf75b9ac778"
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
