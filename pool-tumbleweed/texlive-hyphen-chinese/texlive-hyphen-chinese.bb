SUMMARY = "Chinese pinyin hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for unaccented transliterated Mandarin \
Chinese (pinyin) in T1/EC and UTF-8 encodings. The latter can \
hyphenate pinyin with or without tone markers; the former only \
without."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-chinese-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "487ca7d155e32071e8ae235dd1d6f545d16b1767dc92925c3ac78d85892527d91d4a0086f326d86e170bb00ef55a41139372220ce3db6e1667da525ee89d2881"
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
