SUMMARY = "Basque hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Basque in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-basque-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "7fa77756814190e59a157cf284265d63539aa7ca31ff2ee30d6fa00049ea52ab9fb2c7f39e9c9b1352134cf698b849669881dce581b30d49ae1a504954fa634f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-eu.ec.tex) \
tex(hyph-eu.tex) \
tex(loadhyph-eu.tex) \
texlive-hyphen-basque"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(language.dat) \
tex(language.dat.lua) \
tex(language.def) \
texlive \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
