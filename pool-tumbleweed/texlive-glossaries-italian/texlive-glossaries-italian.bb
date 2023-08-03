SUMMARY = "Italian language module for glossaries package"
DESCRIPTION = "Italian language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-italian-2023.209.1.0svn35665-54.1.noarch.rpm"
RPM_HASH = "fc3dc4fdb47f50220aae79a3baf558ff00cc9bbb64210e3db2005cab04d1aef6e7546934f22900a9ade2d35b5c964cf7bbe252ad03c88d4b746a1f32f8e85c8b"
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
