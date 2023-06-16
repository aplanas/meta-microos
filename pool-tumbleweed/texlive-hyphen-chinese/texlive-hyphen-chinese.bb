SUMMARY = "Chinese pinyin hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for unaccented transliterated Mandarin \
Chinese (pinyin) in T1/EC and UTF-8 encodings. The latter can \
hyphenate pinyin with or without tone markers; the former only \
without."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-chinese-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "8462d7ad773c19b2057744e5a01f11e1d20c0f438dab12063996ad0fe7124750ec0d7984b486160112ce7da50a6d09532197d3d00e1fde5ee52b1b2528cc225c"
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
