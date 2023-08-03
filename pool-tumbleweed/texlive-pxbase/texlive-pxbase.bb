SUMMARY = "Tools for use with (u)pLaTeX"
DESCRIPTION = "The main purpose of this package is to provide auxiliary \
functions which are utilized by other packages created by the \
same author. It also provides a few user commands to assist in \
creating Japanese documents using (u)pLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn66187"

RPM_NAME = "texlive-pxbase-2023.209.1.4svn66187-54.1.noarch.rpm"
RPM_HASH = "514d74c652e93ef4bfe83646b6bfefc5de270b5cae857b69f062f33aee154441e45a16d362f50e89765bc950dc957e4551a76955087530c19d383cf0c428dd93"
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
