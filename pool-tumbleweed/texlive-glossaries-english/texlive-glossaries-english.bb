SUMMARY = "English language module for glossaries package"
DESCRIPTION = "English language module for glossariesr package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-english-2023.209.1.0svn35665-54.2.noarch.rpm"
RPM_HASH = "b32c02877238d2e30cea2d6f8fab9c76b0c8414b5d67bbad28de69eb28de4176d56f327fe93ab776bb500adbf439b143dbbfcad76aafbf14738cb7a04f2e9cae"
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
