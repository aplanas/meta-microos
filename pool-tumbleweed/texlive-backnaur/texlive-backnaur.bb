SUMMARY = "Typeset Backus Naur Form definitions"
DESCRIPTION = "The package typesets Backus-Naur Form (BNF) definitions. It \
prints formatted lists of productions, with numbers if \
required. It can also print in-line BNF expressions using math \
mode."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1svn54080"

RPM_NAME = "texlive-backnaur-2023.209.3.1svn54080-54.1.noarch.rpm"
RPM_HASH = "a87569833285dde91cd4f94e8b39b89e7d0f7d6cbe797e9a88e3906df179c17dbfb95c9d17ee7f92e609efca665c5ef11ddbdf2f299854f5ea7f95fc87b96297"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-backnaur.sty \
texlive-backnaur"

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
