SUMMARY = "Draw trees"
DESCRIPTION = "Macros to draw trees, within TeX (or LaTeX). The algorithm used \
is discussed in an accompanying paper (written using LaTeX \
2.09)."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn28176"

RPM_NAME = "texlive-treetex-2023.201.svn28176-52.1.noarch.rpm"
RPM_HASH = "df556417399200c7db3ed195901b33ea086cc49e3fa9c15b1e816f51083824246670d93f25a9d0d7bd95e3464ab304892a11908c44b61e10f9a94c2e8fb26f74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-classes.tex \
tex-l-pic.tex \
tex-treetex.tex \
texlive-treetex"

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
