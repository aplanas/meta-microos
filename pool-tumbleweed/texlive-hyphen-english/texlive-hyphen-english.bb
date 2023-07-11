SUMMARY = "English hyphenation patterns"
DESCRIPTION = "Additional hyphenation patterns for American and British \
English in ASCII encoding. The American English patterns \
(usenglishmax) greatly extend the standard patterns from Knuth \
to find many additional hyphenation points. British English \
hyphenation is completely different from US English, so has its \
own set of patterns."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58609"

RPM_NAME = "texlive-hyphen-english-2023.208.svn58609-53.1.noarch.rpm"
RPM_HASH = "18b5c224acbfd841ca2d805e13fb0583b4e43c9ea76e12bcc9ad95ebe9bf1dac3bd726f229c7297455534bd426df8074ca107d53554df3a5a3af31b4d6a12055"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-en-gb.tex \
tex-hyph-en-us.tex \
tex-loadhyph-en-gb.tex \
tex-loadhyph-en-us.tex \
texlive-hyphen-english"

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
