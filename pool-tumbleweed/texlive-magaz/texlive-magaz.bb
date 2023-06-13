SUMMARY = "Magazine layout"
DESCRIPTION = "The current version does special formatting for the first line \
of text in a paragraph. The package is part of a larger body of \
tools which remain in preparation."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn24694"

RPM_NAME = "texlive-magaz-2023.201.0.0.4svn24694-52.1.noarch.rpm"
RPM_HASH = "212fbe60b8f42041709cea593af7a768629662c59aec2e253ef54462c27f57741f26b585be8a9102b636864633d74cb5d7137bc879b58811f6d9b4b3abe73010"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(magaz.sty) \
texlive-magaz"

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
