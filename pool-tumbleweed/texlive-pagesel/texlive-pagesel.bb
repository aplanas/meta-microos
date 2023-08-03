SUMMARY = "Select pages of a document for output"
DESCRIPTION = "Selects single pages, ranges of pages, odd pages or even pages \
for output. The package is part of the oberdiek bundle."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10svn56105"

RPM_NAME = "texlive-pagesel-2023.209.1.10svn56105-52.1.noarch.rpm"
RPM_HASH = "2352e1eb6082729577242ed6d93d9e6f9e7bf320dc825d7fb68f68bfb5cc6234230bbe3df7daeb87fd6f36a0f0b80c8e2908e47286bdc32981599c6f4ac1d241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pagesel-2016-05-16.sty \
tex-pagesel.sty \
texlive-pagesel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everyshi.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
