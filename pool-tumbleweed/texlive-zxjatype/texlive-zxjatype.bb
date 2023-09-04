SUMMARY = "Standard conforming typesetting of Japanese, for XeLaTeX"
DESCRIPTION = "The zxjatype package"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn53500"

RPM_NAME = "texlive-zxjatype-2023.209.0.0.7svn53500-53.2.noarch.rpm"
RPM_HASH = "156041ae730e22c0c6aa4a6f12e9abd4e4e71df899858109dbb58d5805820b6967af55afaded9e9175a437ec1a32d66a03668f3625f7f8c5cbf2add08f531ffe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zxjatype.sty \
texlive-zxjatype"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-ifxetex.sty \
tex-xeCJK.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
