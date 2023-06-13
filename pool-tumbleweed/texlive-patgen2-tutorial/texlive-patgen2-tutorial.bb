SUMMARY = "A tutorial on the use of Patgen 2"
DESCRIPTION = "This document describes the use of Patgen 2 to create \
hyphenation patterns for wide ranges of languages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn58841"

RPM_NAME = "texlive-patgen2-tutorial-2023.201.1.1svn58841-51.1.noarch.rpm"
RPM_HASH = "9b27a7ad35994d65f0be184187062910dab655063f9c860d08e36826bc9ae8b9eda722f9407a3efe2699e1dcb1d8f7fa9f772a1f78f55ade6128e038436bf5aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-patgen2-tutorial"

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
