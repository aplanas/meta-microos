SUMMARY = "IEEE Power Engineering Society Transactions"
DESCRIPTION = "Supports typesetting of transactions, as well as discussions \
and closures, for the IEEE Power Engineering Society \
Transactions journals."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.0svn17359"

RPM_NAME = "texlive-ieeepes-2023.201.4.0svn17359-52.1.noarch.rpm"
RPM_HASH = "b8688987454c78e6c4d9496a6652d5e93ca46d3ee842a6d84ba4af91ac32008ef6ab5870a94f72a0b03145eb085ca0ccf0b1581f4f2dc550162880e8ee8f5bdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ieeepes.sty \
texlive-ieeepes"

RDEPENDS:${PN} += "/bin/sh \
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
