SUMMARY = "Tools for use with (u)pLaTeX"
DESCRIPTION = "The main purpose of this package is to provide auxiliary \
functions which are utilized by other packages created by the \
same author. It also provides a few user commands to assist in \
creating Japanese documents using (u)pLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn66187"

RPM_NAME = "texlive-pxbase-2023.209.1.4svn66187-54.2.noarch.rpm"
RPM_HASH = "cba04019a6fc10c03eb545573164219ca2cfc41061852960f80b24e43144ed888bc67efbe0c4116556de080d6b1515911dca6cdc4db6fc40b8895514d6f59665"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pxbabel.sty \
tex-pxbase.def \
tex-pxbase.sty \
tex-pxbasenc.def \
tex-pxbsjc.def \
tex-pxbsjc1.def \
tex-pxjsfenc.def \
tex-upkcat.sty \
texlive-pxbase"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-bxbase.sty \
tex-ifptex.sty \
tex-ifuptex.sty \
tex-rlbabel.def \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
