SUMMARY = "Show label commands in the margin"
DESCRIPTION = "This package helps you keep track of all the labels you define, \
by putting the name of new labels into the margin whenever the \
\\label command is used. The package allows you to do the same \
thing for other commands. The only one for which this is \
obviously useful is the \\cite command, but it's easy to do it \
for others, such as the \\ref or \\begin commands."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9.2svn63940"

RPM_NAME = "texlive-showlabels-2023.209.1.9.2svn63940-54.1.noarch.rpm"
RPM_HASH = "afbe4ace933ffd1361e9accd82af2481107a5d51add2914f5ccf7dfcc4aef4594050e39fda9ad5b8cdd895ace0a01ba22caf8451508305d61cd88e08e7e63e16"
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
