SUMMARY = "English hyphenation patterns"
DESCRIPTION = "Additional hyphenation patterns for American and British \
English in ASCII encoding. The American English patterns \
(usenglishmax) greatly extend the standard patterns from Knuth \
to find many additional hyphenation points. British English \
hyphenation is completely different from US English, so has its \
own set of patterns."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58609"

RPM_NAME = "texlive-hyphen-english-2023.209.svn58609-54.1.noarch.rpm"
RPM_HASH = "1536461648409ebd7d617440b0dfc12cb49c4b6fc7be9b6a77c4d08ecc489d9b1cf51d07741217772b20a9791d2960026a5e6a5296ee9f452bae386ca1b6dd07"
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
