SUMMARY = "Typeset Young-Tableaux"
DESCRIPTION = "A package for typesetting Young-Tableaux, mathematical symbols \
for the representations of groups, providing two macros, \
\\yng(1) and \\young(1) to generate the whole Young-Tableau."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn56500"

RPM_NAME = "texlive-youngtab-2023.201.1.1svn56500-52.1.noarch.rpm"
RPM_HASH = "e277db7376ca2f73ca4fe1cb21a6d76138c91a9b34bfc85a593c16abd2463deef2c725389299d99e9a21606ef5fee3c05d0309021abc60086157b1aa6d368caa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(youngtab.sty) \
texlive-youngtab"

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
