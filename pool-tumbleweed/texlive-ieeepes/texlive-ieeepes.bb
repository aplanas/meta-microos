SUMMARY = "IEEE Power Engineering Society Transactions"
DESCRIPTION = "Supports typesetting of transactions, as well as discussions \
and closures, for the IEEE Power Engineering Society \
Transactions journals."
LICENSE = "LPPL-1.0"

PV = "2023.208.4.0svn17359"

RPM_NAME = "texlive-ieeepes-2023.208.4.0svn17359-53.1.noarch.rpm"
RPM_HASH = "0a82f898a08798020429b307c96fd72e983a173e0cce6c928fc48766c6d3fcdb03e0b761447b2dd02918a96785de34be351348280882c8795b7cca8d7085570c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ieeepes.sty \
texlive-ieeepes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-mathptm.sty \
tex-times.sty \
tex-vmargin.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
