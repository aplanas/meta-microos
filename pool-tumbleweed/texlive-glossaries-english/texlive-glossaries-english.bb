SUMMARY = "English language module for glossaries package"
DESCRIPTION = "English language module for glossariesr package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-english-2023.201.1.0svn35665-53.1.noarch.rpm"
RPM_HASH = "1a667f5b5561d40724d410dec929c09b20200a2683d922010f779dad5e97884e6043ccd41d05ecdb8513fc2d9589df8a874608b21b05e11eb927d8c9f8abbc26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-english.ldf \
texlive-glossaries-english"

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
