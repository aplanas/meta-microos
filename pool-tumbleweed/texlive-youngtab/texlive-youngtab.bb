SUMMARY = "Typeset Young-Tableaux"
DESCRIPTION = "A package for typesetting Young-Tableaux, mathematical symbols \
for the representations of groups, providing two macros, \
\\yng(1) and \\young(1) to generate the whole Young-Tableau."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn56500"

RPM_NAME = "texlive-youngtab-2023.201.1.1svn56500-52.2.noarch.rpm"
RPM_HASH = "ec67dbbfa31ad777e9f27452f316a102a732f027087ea3ec58a3482e9f052bdd6485c14840de8b9383077bf3ae2fd23cb374d694a8a9c96cd6613a31867e6d63"
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
