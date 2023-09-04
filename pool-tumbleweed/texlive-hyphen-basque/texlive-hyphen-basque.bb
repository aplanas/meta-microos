SUMMARY = "Basque hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Basque in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-basque-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "5b12bf7445171e6be161410aa17338be44e7b3e11694ef134f04fbb5e18a6719f9a51a9e045d376dbc117731abd276ca4df77ae4e97ce0eb25d31cbcde01dba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-eu.ec.tex \
tex-hyph-eu.tex \
tex-loadhyph-eu.tex \
texlive-hyphen-basque"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
