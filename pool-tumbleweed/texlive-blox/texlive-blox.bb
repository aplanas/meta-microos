SUMMARY = "Draw block diagrams, using TikZ"
DESCRIPTION = "This package, along with TikZ, will typeset block diagrams for \
use with programming and control theory. It is an English \
translation of the schemabloc package."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.51svn57949"

RPM_NAME = "texlive-blox-2023.201.2.51svn57949-52.1.noarch.rpm"
RPM_HASH = "726d49b628da110927e844a8da65ac4e0fc4fe109848435a1a0a41b75f9532c280d48a894bfe0eff4a96ea802027638724c629f67cfbb2ea04f82ea451350796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(blox.sty) \
texlive-blox"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
tex(pgffor.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
