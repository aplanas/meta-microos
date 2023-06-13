SUMMARY = "Icelandic hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Icelandic in T1/EC and UTF-8 \
encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-icelandic-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "41806d6f443bbce5905de8c58f7ef283f355df3999afd2714c92c2de40556c8fb10048795bc52654d6720f4975acac590e83a727969f9c6d0cf456f287053099"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-is.ec.tex) \
tex(hyph-is.tex) \
tex(loadhyph-is.tex) \
texlive-hyphen-icelandic"

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
