SUMMARY = "Draw trees"
DESCRIPTION = "Macros to draw trees, within TeX (or LaTeX). The algorithm used \
is discussed in an accompanying paper (written using LaTeX \
2.09)."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn28176"

RPM_NAME = "texlive-treetex-2023.209.svn28176-53.1.noarch.rpm"
RPM_HASH = "46a1b6fecc7b21d4bb84667260ace02cc117e4b8a1032f4e6f2e4c693aba411162148eeb06ed13a9c161c1366eda302a060d3299ffab2de575eb51111241c7f1"
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
