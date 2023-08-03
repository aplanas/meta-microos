SUMMARY = "Standard conforming typesetting of Japanese, for XeLaTeX"
DESCRIPTION = "The zxjatype package"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn53500"

RPM_NAME = "texlive-zxjatype-2023.209.0.0.7svn53500-53.1.noarch.rpm"
RPM_HASH = "2a44d8eb4211beaf89ccb077e79a0ccd7df642ca1fcbd0bd02dbaf570370bcc36c603d741599ab8717bce95c1def3ca0f8ade8942d87c2d4d4b7422cf981fd23"
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
