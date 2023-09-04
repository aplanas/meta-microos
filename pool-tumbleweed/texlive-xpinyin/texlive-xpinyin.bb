SUMMARY = "Automatically add pinyin to Chinese characters"
DESCRIPTION = "The package is written to simplify the input of Hanyu Pinyin. \
Macros are provided that automatically add pinyin to Chinese \
characters."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1svn66115"

RPM_NAME = "texlive-xpinyin-2023.209.3.1svn66115-53.2.noarch.rpm"
RPM_HASH = "d475cdf8d6fe13edb69ea68af521d8e039cf4b5f4b684faaf142d12cc65f123c7aaba5181420f6f24b3a476e9cca9fa83f0967b051861c856d54301dd04428a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xpinyin-database.def \
tex-xpinyin.sty \
texlive-xpinyin"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-CJKutf8.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xCJK2uni.sty \
tex-xeCJK.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
