SUMMARY = "Computational complexity class names"
DESCRIPTION = "Complexity is a LaTeX package that defines commands to typeset \
Computational Complexity Classes such as $\\P$ and $\\NP$ (as \
well as hundreds of others). It also offers several options \
including which font classes are typeset in and how many are \
defined (all of them or just the basic, most commonly used \
ones). The package has no dependencies other than the standard \
ifthen package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.81asvn45322"

RPM_NAME = "texlive-complexity-2023.209.0.0.81asvn45322-54.1.noarch.rpm"
RPM_HASH = "24465aef304aec9cbb39fecfd42422d4fb03cfc2ed4f98872fa1d643446c31374068c5487d9e400953d8666794883beebcb8ad13eb2a9b4c7d37d30d65e1e788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-complexity.sty \
tex-mycomplexity.sty \
texlive-complexity"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
