SUMMARY = "Probability trees with MetaPost"
DESCRIPTION = "This package provides MetaPost tools for drawing simple \
probability trees. One command and several parameters to \
control the output are provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.21.11svn60929"

RPM_NAME = "texlive-mptrees-2023.201.21.11svn60929-54.1.noarch.rpm"
RPM_HASH = "65b777043db953d39b1f86e1ff47274c1ddf1714df344547e17c948a5613ef8ff39d6c65db33887a6c2045acc2f47d69745f13210848c45ef02de760b0107285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mptrees"

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
