SUMMARY = "Create tiling patterns with the minim-mp MetaPost processor"
DESCRIPTION = "This is a small proof-of-concept library of tiling patterns for \
use with the minim-mp MetaPost processor."
LICENSE = "LPPL-1.0"

PV = "2023.209.2022_1.1svn62395"

RPM_NAME = "texlive-minim-hatching-2023.209.2022_1.1svn62395-55.1.noarch.rpm"
RPM_HASH = "b9a8d45bda1c8c8ba1d78baa0be0de3a4fed5b69652e673404f151d67249616809ddb2d93bb3429cada94d01c385259598635d7561220efbae39150dbcff3605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minim-hatching"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
