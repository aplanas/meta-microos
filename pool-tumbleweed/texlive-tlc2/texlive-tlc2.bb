SUMMARY = "Examples from 'The LaTeX Companion', second edition"
DESCRIPTION = "The source of the examples printed in the book, together with \
necessary supporting files. The book was published by \
Addison-Wesley, 2004, ISBN 0-201-36299-6."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn26096"

RPM_NAME = "texlive-tlc2-2023.209.svn26096-53.1.noarch.rpm"
RPM_HASH = "401ff78fd115cfc36a75198b122fa151f9374a459d2e4e347ddf273a84149e824cede5f279c7a406894ff27a5a9be32797e695a12f39a4b647899fb53e016734"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tlc2"

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
