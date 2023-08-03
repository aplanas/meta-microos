SUMMARY = "Automatically add pinyin to Chinese characters"
DESCRIPTION = "The package is written to simplify the input of Hanyu Pinyin. \
Macros are provided that automatically add pinyin to Chinese \
characters."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1svn66115"

RPM_NAME = "texlive-xpinyin-2023.209.3.1svn66115-53.1.noarch.rpm"
RPM_HASH = "be81be24493b677b18ac04bd99f2929ff9172c0976d72fddf74b13a32982f616f5773e015083691d9ef90c9338ab91716ee560f7ca0f73f52e087e2ba75be5dd"
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
