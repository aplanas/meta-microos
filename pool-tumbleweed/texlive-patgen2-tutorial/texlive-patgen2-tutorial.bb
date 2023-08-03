SUMMARY = "A tutorial on the use of Patgen 2"
DESCRIPTION = "This document describes the use of Patgen 2 to create \
hyphenation patterns for wide ranges of languages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn58841"

RPM_NAME = "texlive-patgen2-tutorial-2023.209.1.1svn58841-52.1.noarch.rpm"
RPM_HASH = "abb682643d394e68396e8df8697a4e171933ae77f981fe566c0d2059d2e489ab9aaa90e55981036460432af59b51b0274fb2644b299ec85a10534779c234d50a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-patgen2-tutorial"

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
