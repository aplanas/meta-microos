SUMMARY = "Italian language module for glossaries package"
DESCRIPTION = "Italian language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-italian-2023.209.1.0svn35665-54.2.noarch.rpm"
RPM_HASH = "42b74c8f0d91a98240546322b5cc59c881d95c0b62e647ab23866b39f2bc2d948820a1583070384408a657abeb2b458408f7c5af046f4fcecfa5a7fa30be6aef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-italian.ldf \
texlive-glossaries-italian"

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
