SUMMARY = "German version of booktabs"
DESCRIPTION = "This is a 'translation' of the booktabs."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.61803svn21907"

RPM_NAME = "texlive-booktabs-de-2023.201.1.61803svn21907-52.1.noarch.rpm"
RPM_HASH = "7edb5cf33620ae6de0ea4213f89d2ff1bb2d26e405de06eb50bfbd0b4519cb87162b477d735ca57af362f6c57c7b6dd71ba94378ac322370d0031d1e0ef52da4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-booktabs-de"

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
