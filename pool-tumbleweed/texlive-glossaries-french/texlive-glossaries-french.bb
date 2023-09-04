SUMMARY = "French language module for glossaries package"
DESCRIPTION = "French language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn42873"

RPM_NAME = "texlive-glossaries-french-2023.209.1.1svn42873-54.2.noarch.rpm"
RPM_HASH = "74441f8d3663de4ab67fe90429cb2161fa46105c0acc4a60fb6fe74caa36e8a96aabfebc6d871179c5c5fa4f1ca4858ffb6ed639ef78f90ffe8dbb0c44da133c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-french.ldf \
texlive-glossaries-french"

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
