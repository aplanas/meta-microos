SUMMARY = "Use color definitions from latexcolor.com"
DESCRIPTION = "Built on top of the xcolor package, the latexcolors package \
defines the set of colors shown on latexcolor.com for use in \
documents typeset with LaTeX & friends."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1asvn49888"

RPM_NAME = "texlive-latexcolors-2023.209.0.0.1asvn49888-55.1.noarch.rpm"
RPM_HASH = "cbb6be76dca4cb2fd30663e7828ae210c692a8b413fb3d4dc880fabb7ca4ef07ad2f4b673684c5ccf5f5fdfa6baf0b43895bc713fb178ef9c4a35711b29959a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-latexcolors.sty \
texlive-latexcolors"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
