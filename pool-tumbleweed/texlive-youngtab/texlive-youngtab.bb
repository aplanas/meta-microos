SUMMARY = "Typeset Young-Tableaux"
DESCRIPTION = "A package for typesetting Young-Tableaux, mathematical symbols \
for the representations of groups, providing two macros, \
\\yng(1) and \\young(1) to generate the whole Young-Tableau."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn56500"

RPM_NAME = "texlive-youngtab-2023.209.1.1svn56500-53.1.noarch.rpm"
RPM_HASH = "5b8f5818226b810654f6ca23950ef6e84692548d2a73bb5f21e76828b17a19072ae9e72710c184d19ead244d527b7856f673d238dd59c589dd19398de7e94c6a"
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
