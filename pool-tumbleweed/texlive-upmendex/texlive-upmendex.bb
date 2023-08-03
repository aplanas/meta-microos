SUMMARY = "Multilingual index processor"
DESCRIPTION = "The package is a multilingual index processor with the \
following features: Mostly compatible with makeindex and upper \
compatible with mendex. Supports UTF-8 and works with upLaTeX, \
XeLaTeX and LuaLaTeX. Supports Latin (including non-English), \
Greek, Cyrillic, Korean Hangul and Chinese Han (Hanzi \
ideographs) scripts, as well as Japanese Kana. Supports \
Devanagari, Thai, Arabic and Hebrew scripts (experimental). \
Supports four kinds of sort orders (Pinyin, Radical-Stroke, \
Stroke and Zhuyin) for Chinese Han scripts (Hanzi ideographs). \
Applies International Components for Unicode (ICU) for sorting \
process."
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.07svn66381"

RPM_NAME = "texlive-upmendex-2023.209.1.07svn66381-54.1.noarch.rpm"
RPM_HASH = "79087ab9237b5480c6c280045fd52b00280389d2cee5bfa42e41bcc3afe37b81ff09f0f2d4bcb48b8eda6eba3d30a2c090d20111509c09e646833fc06ac1bdb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-upmendex.1 \
texlive-upmendex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-upmendex-bin"

inherit rpm
