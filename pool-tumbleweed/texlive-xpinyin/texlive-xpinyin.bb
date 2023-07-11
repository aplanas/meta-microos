SUMMARY = "Automatically add pinyin to Chinese characters"
DESCRIPTION = "The package is written to simplify the input of Hanyu Pinyin. \
Macros are provided that automatically add pinyin to Chinese \
characters."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1svn66115"

RPM_NAME = "texlive-xpinyin-2023.201.3.1svn66115-52.2.noarch.rpm"
RPM_HASH = "63df91b9e821ed05c1c665efd75da8faf49a9b4d11b8d3b9e0a36c51aa92691ea23d957024e59cdb6a3dbc4de01f176165a51f2bf805380e2f01561da1695da3"
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
