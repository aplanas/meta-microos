SUMMARY = "Irish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Irish (Gaeilge) in T1/EC and UTF-8 \
encodings."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58609"

RPM_NAME = "texlive-hyphen-irish-2023.208.svn58609-53.1.noarch.rpm"
RPM_HASH = "1ac2e43df2864f5643e1462e9571a7a7c8f9f4317a0e3cdf4eaa66196bc3836019351fb363d825580f5b4c62e8631f7af7866d94a393997450264678f8e091f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-ga.ec.tex \
tex-hyph-ga.tex \
tex-loadhyph-ga.tex \
texlive-hyphen-irish"

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
