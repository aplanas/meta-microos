SUMMARY = "Chinese pinyin hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for unaccented transliterated Mandarin \
Chinese (pinyin) in T1/EC and UTF-8 encodings. The latter can \
hyphenate pinyin with or without tone markers; the former only \
without."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-chinese-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "f5a75377e87df8b105e2f1382e7e8cb27e56742a52e1e3f76201ec28d04b7fb7a6aeafed429b04320cbf45f454443da2da666690c9d11256830f1c776e990703"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-zh-latn-pinyin.ec.tex \
tex-hyph-zh-latn-pinyin.tex \
tex-loadhyph-zh-latn-pinyin.tex \
texlive-hyphen-chinese"

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
