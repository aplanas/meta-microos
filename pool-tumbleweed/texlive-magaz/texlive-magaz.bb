SUMMARY = "Magazine layout"
DESCRIPTION = "The current version does special formatting for the first line \
of text in a paragraph. The package is part of a larger body of \
tools which remain in preparation."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.4svn24694"

RPM_NAME = "texlive-magaz-2023.208.0.0.4svn24694-53.1.noarch.rpm"
RPM_HASH = "7b5c1cee7486e6ea8d4320614a5cb8f909c0a200b2224f1944430f5a3d5e38ad844ae874e2c45a5f2607066567265c35d0e5df5a5c5527b7f89e1ba07f203871"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-magaz.sty \
texlive-magaz"

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
