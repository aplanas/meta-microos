SUMMARY = "Spanish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Spanish in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.209.5.0svn58652"

RPM_NAME = "texlive-hyphen-spanish-2023.209.5.0svn58652-54.1.noarch.rpm"
RPM_HASH = "a912b2340502b556b840b9d6a37f471ab59ed5f517be073699155888724ade8ffe9172b8efcfadd534dc0b92429e90914ba025090056187c68238f3562de9c66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-es.ec.tex \
tex-hyph-es.tex \
tex-loadhyph-es.tex \
texlive-hyphen-spanish"

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
