SUMMARY = "Draw pixel pictures"
DESCRIPTION = "With pxpic you draw pictures pixel by pixel. It was inspired by \
a lovely post by Paulo Cereda, among other things (most notably \
a beautiful duck) showcasing the use of characters from the \
Mario video games by Nintendo in LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn65803"

RPM_NAME = "texlive-pxpic-2023.201.1.4svn65803-53.2.noarch.rpm"
RPM_HASH = "1e585abd7fcde95654efd68ea214f6333524bfeb4c6e2b7dc2164a0fe3aa6805fc868c30f8aae342cfd7ff83530da616c44146addceb37e5c10de5d34c6fc85e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pxpic.sty \
texlive-pxpic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expkv.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
