SUMMARY = "Freed version of the book TeX by Topic"
DESCRIPTION = "An invaluable book, originally published by Addison-Wesley (who \
have released their copyright -- their version of the book went \
out of print in the 1990s). The book describes itself as 'a \
TeXnician's reference', and covers the way TeX (the engine) \
works in as much detail as most ordinary TeX programmers will \
ever need to know. A printed copy of the book may be had (for a \
modest price) via lulu.com (see the package home page for \
details)."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-texbytopic-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "48ba0a5a6b986b89b28ab59629b84c4b7b1863c37583ed8e9b31465c1d7a3670c42f5738928b49cd649f61e2120c6a4a21e2f217568bbda9f9242d340cd5bf1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texbytopic"

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
