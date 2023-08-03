SUMMARY = "Kana parser for LuaTeX"
DESCRIPTION = "The package provides a kana parser for LuaTeX. It is a set of 4 \
macros that handle transliteration of text: from hiragana and \
katakana to Latin from Latin and katakana to hiragana from \
Latin and hiragana to katakana It can be used to write kana \
directly using only the ASCII character set or for education \
purposes. The package has support for obsolete and rarely used \
syllables, some only accessible via the provided toggle macro."
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.0svn48052"

RPM_NAME = "texlive-kanaparser-2023.209.1.0svn48052-56.1.noarch.rpm"
RPM_HASH = "597d9e947e42c0d554f2792b3d31250d0f807a4c10d4700daf49e42c45812655dbb6b40fedbc52de70da501cb5a6e552535a4da64b841cbf3e72c997e17f9d7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kanaparser.tex \
texlive-kanaparser"

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
texlive-scripts-bin"

inherit rpm
