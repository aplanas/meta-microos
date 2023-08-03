SUMMARY = "Polish language module for glossaries package"
DESCRIPTION = "Polish language module for the glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-polish-2023.209.1.0svn35665-54.1.noarch.rpm"
RPM_HASH = "6d09465272e13933435b426f9903ab3dfe77d3bc71b25c6f53e0629ac1d037f12238865bf49fbf95ebc8d238073cd4e1ccae7ddd4f9c89f9e10f1a6ba4f86a37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-polish-noenc.ldf \
tex-glossaries-polish-utf8.ldf \
tex-glossaries-polish.ldf \
texlive-glossaries-polish"

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
