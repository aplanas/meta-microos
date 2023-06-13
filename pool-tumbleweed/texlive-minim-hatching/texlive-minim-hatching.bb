SUMMARY = "Create tiling patterns with the minim-mp MetaPost processor"
DESCRIPTION = "This is a small proof-of-concept library of tiling patterns for \
use with the minim-mp MetaPost processor."
LICENSE = "LPPL-1.0"

PV = "2023.201.2022_1.1svn62395"

RPM_NAME = "texlive-minim-hatching-2023.201.2022_1.1svn62395-54.1.noarch.rpm"
RPM_HASH = "20f18212ce846d8e6bd4957ba100b0804ec9a7c822e7f35376362fbf980c2a6b9ceed8c67a6e5cc470b2b03b121b1a6122250875126d8cf0a1940598193be845"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minim-hatching"

RDEPENDS:${PN} += "/bin/sh \
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
