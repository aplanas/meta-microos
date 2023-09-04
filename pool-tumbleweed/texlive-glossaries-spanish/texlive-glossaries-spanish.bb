SUMMARY = "Spanish language module for glossaries package"
DESCRIPTION = "Spanish language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-spanish-2023.209.1.0svn35665-54.2.noarch.rpm"
RPM_HASH = "a5893e8824bc0a964b97836520ce376539c5889e71a3bccad072b4f1790a2e694b94104293261da85882efbb98ec8db0616508941730fa8b4e98ae035a599067"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-spanish-noenc.ldf \
tex-glossaries-spanish-utf8.ldf \
tex-glossaries-spanish.ldf \
texlive-glossaries-spanish"

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
