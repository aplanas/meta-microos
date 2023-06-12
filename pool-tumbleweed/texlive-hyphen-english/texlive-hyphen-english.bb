SUMMARY = "English hyphenation patterns"
DESCRIPTION = "Additional hyphenation patterns for American and British \
English in ASCII encoding. The American English patterns \
(usenglishmax) greatly extend the standard patterns from Knuth \
to find many additional hyphenation points. British English \
hyphenation is completely different from US English, so has its \
own set of patterns."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58609"

RPM_NAME = "texlive-hyphen-english-2023.201.svn58609-52.1.noarch.rpm"
RPM_HASH = "7d02eb43e6f68848b9713abe83dea569a16174cc8f8fb1b0dd1ecc1af72e282aaef2c140bcc02f5c877439cdaf81cd356dcbd0e70f51f1798ebcd32051e00be1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-en-gb.tex) \
tex(hyph-en-us.tex) \
tex(loadhyph-en-gb.tex) \
tex(loadhyph-en-us.tex) \
texlive-hyphen-english"
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
