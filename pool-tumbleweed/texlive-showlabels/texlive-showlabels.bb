SUMMARY = "Show label commands in the margin"
DESCRIPTION = "This package helps you keep track of all the labels you define, \
by putting the name of new labels into the margin whenever the \
\\label command is used. The package allows you to do the same \
thing for other commands. The only one for which this is \
obviously useful is the \\cite command, but it's easy to do it \
for others, such as the \\ref or \\begin commands."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9.2svn63940"

RPM_NAME = "texlive-showlabels-2023.201.1.9.2svn63940-53.1.noarch.rpm"
RPM_HASH = "7ebd66bec15339cd03953cc39526018e6b5fd2c73f8fcd69d3bd81e44d244fcec0c5e125f1cca02be917db9153cf6f29e6343dbfdc406bee1c4834aeaa0ba170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-showlabels.sty \
texlive-showlabels"

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
