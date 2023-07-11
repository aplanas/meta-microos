SUMMARY = "Slovenian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Slovenian in T1/EC and UTF-8 \
encodings."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-slovenian-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "40354e969d6760b36508baf479ee0fff9e3a1988bfde71ac0abf9e145b8da99eda769dd9731d85038f9a5cd1d9f62a85258b908301122cfebe3eabfa636c9ae1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-sl.ec.tex \
tex-hyph-sl.tex \
tex-loadhyph-sl.tex \
texlive-hyphen-slovenian"

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
