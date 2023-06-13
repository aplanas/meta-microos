SUMMARY = "Automatically add pinyin to Chinese characters"
DESCRIPTION = "The package is written to simplify the input of Hanyu Pinyin. \
Macros are provided that automatically add pinyin to Chinese \
characters."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1svn66115"

RPM_NAME = "texlive-xpinyin-2023.201.3.1svn66115-52.1.noarch.rpm"
RPM_HASH = "580d24595e1586ad818da79f72cd955e0bf4825757d71be5924f81d19fda2c643e31e42f511226d33db1ac135e94a1a40a9f836a618f73dee0175d2fae29642c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xpinyin-database.def) \
tex(xpinyin.sty) \
texlive-xpinyin"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(CJKutf8.sty) \
tex(expl3.sty) \
tex(l3keys2e.sty) \
tex(xCJK2uni.sty) \
tex(xeCJK.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
