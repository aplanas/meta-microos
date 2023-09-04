SUMMARY = "IEEE Power Engineering Society Transactions"
DESCRIPTION = "Supports typesetting of transactions, as well as discussions \
and closures, for the IEEE Power Engineering Society \
Transactions journals."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.0svn17359"

RPM_NAME = "texlive-ieeepes-2023.209.4.0svn17359-54.1.noarch.rpm"
RPM_HASH = "737f01c5892dc5d1e6ecc0fbba105098132a53a8608221681cab4e78e91b822b3d472573270775f1f89b949c01940802b3c4dd700116c9fd4e1e71d0cf4b4a3d"
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
