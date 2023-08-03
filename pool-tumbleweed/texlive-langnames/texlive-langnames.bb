SUMMARY = "Name languages and their genetic affiliations consistently"
DESCRIPTION = "This package attempts to make the typing of language names, \
codes, and families slightly easier by providing macros to \
access pre-defined language--code--family combinations from two \
important databases, as well as the possibility to create new \
combinations. It may be particularly useful for large, \
collaborative projects as well as typologically minded ones \
with a variety of language examples."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn65502"

RPM_NAME = "texlive-langnames-2023.209.2.1svn65502-56.1.noarch.rpm"
RPM_HASH = "91f06453f62b4d6dfbaf82dbffc1f95d489a19d6e402dc46b97cf6ab54355fd31d106fca862e23c5a8048bf076fefdce566e63432ef04a89557165de8de539f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-langnames.sty \
tex-ln-fams-glot.tex \
tex-ln-fams-wals.tex \
tex-ln-langs-glot-native.tex \
tex-ln-langs-glot.tex \
tex-ln-langs-wals-native.tex \
tex-ln-langs-wals.tex \
texlive-langnames"

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
