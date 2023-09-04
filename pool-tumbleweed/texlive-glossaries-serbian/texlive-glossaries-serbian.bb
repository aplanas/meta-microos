SUMMARY = "Serbian language module for glossaries package"
DESCRIPTION = "Serbian language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-serbian-2023.209.1.0svn35665-54.2.noarch.rpm"
RPM_HASH = "35ca813a6081b9c7d020c5cd7ebda67cd9dcc7c6eff9e852f84ce9333c4eeb32b5b3125d5fa5e0bd78d7b8568f4382b7b677d55b17ea9cd914495c21ca7ec5b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-serbian-noenc.ldf \
tex-glossaries-serbian-utf8.ldf \
tex-glossaries-serbian.ldf \
texlive-glossaries-serbian"

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
