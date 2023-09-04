SUMMARY = "Typeset Young-Tableaux"
DESCRIPTION = "A package for typesetting Young-Tableaux, mathematical symbols \
for the representations of groups, providing two macros, \
\\yng(1) and \\young(1) to generate the whole Young-Tableau."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn56500"

RPM_NAME = "texlive-youngtab-2023.209.1.1svn56500-53.2.noarch.rpm"
RPM_HASH = "91d2f6449de3a34f7fc3c20a73c13c3f0ef7d9c4353ac93b6dd2f9d410a2aa77477bfeb10d203bd40c7b876f3250845c5a32dacc30e7717df03a2906e7049b82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-youngtab.sty \
texlive-youngtab"

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
