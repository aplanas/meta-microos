SUMMARY = "Tools for use with (u)pLaTeX"
DESCRIPTION = "The main purpose of this package is to provide auxiliary \
functions which are utilized by other packages created by the \
same author. It also provides a few user commands to assist in \
creating Japanese documents using (u)pLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn66187"

RPM_NAME = "texlive-pxbase-2023.201.1.4svn66187-53.2.noarch.rpm"
RPM_HASH = "f2a4cc57f20cee5685b8e7e511b25b83d6626bc2a3dc283b6f7c9c8d6050575be5b97180b4f3f98db0ddd95c65c9f569a9186a37fca9a0b461e4efaa0d46b4c9"
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
