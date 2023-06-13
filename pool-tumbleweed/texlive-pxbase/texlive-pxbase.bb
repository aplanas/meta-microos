SUMMARY = "Tools for use with (u)pLaTeX"
DESCRIPTION = "The main purpose of this package is to provide auxiliary \
functions which are utilized by other packages created by the \
same author. It also provides a few user commands to assist in \
creating Japanese documents using (u)pLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn66187"

RPM_NAME = "texlive-pxbase-2023.201.1.4svn66187-53.1.noarch.rpm"
RPM_HASH = "827231d7639b290c3e98c3c650ea0f8b5716f2588621ab4a6ad3c4ecd263d09f4907ddfca009566f4198871dd42819396e25c9470848d58acf9d446627cd5cfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pxbabel.sty) \
tex(pxbase.def) \
tex(pxbase.sty) \
tex(pxbasenc.def) \
tex(pxbsjc.def) \
tex(pxbsjc1.def) \
tex(pxjsfenc.def) \
tex(upkcat.sty) \
texlive-pxbase"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(babel.sty) \
tex(bxbase.sty) \
tex(ifptex.sty) \
tex(ifuptex.sty) \
tex(rlbabel.def) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
