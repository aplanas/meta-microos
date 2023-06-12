SUMMARY = "Use color definitions from latexcolor.com"
DESCRIPTION = "Built on top of the xcolor package, the latexcolors package \
defines the set of colors shown on latexcolor.com for use in \
documents typeset with LaTeX & friends."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1asvn49888"

RPM_NAME = "texlive-latexcolors-2023.201.0.0.1asvn49888-54.1.noarch.rpm"
RPM_HASH = "ff58942f7703383808f811790fca46fa63ed0e3be209a45196b67b388b7119c84ee2b58c8faef7d619d86825cfaf8f261212034da139ce8b50b189fd34deb6f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(latexcolors.sty) \
texlive-latexcolors"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
