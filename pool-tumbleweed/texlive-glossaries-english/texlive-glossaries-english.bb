SUMMARY = "English language module for glossaries package"
DESCRIPTION = "English language module for glossariesr package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-english-2023.201.1.0svn35665-53.2.noarch.rpm"
RPM_HASH = "0c0191e458c75dbc94478d20649132eea3c994337e0b89136f273f6a56be24ac92fad343e1d5ab5f30ca6c09695910d9c63752c5deb09341eb4a841830558fc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-english.ldf \
texlive-glossaries-english"

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
