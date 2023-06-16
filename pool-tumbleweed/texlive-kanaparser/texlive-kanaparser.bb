SUMMARY = "Kana parser for LuaTeX"
DESCRIPTION = "The package provides a kana parser for LuaTeX. It is a set of 4 \
macros that handle transliteration of text: from hiragana and \
katakana to Latin from Latin and katakana to hiragana from \
Latin and hiragana to katakana It can be used to write kana \
directly using only the ASCII character set or for education \
purposes. The package has support for obsolete and rarely used \
syllables, some only accessible via the provided toggle macro."
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.0svn48052"

RPM_NAME = "texlive-kanaparser-2023.201.1.0svn48052-55.1.noarch.rpm"
RPM_HASH = "d5d3a884ac95ed2c2a2cb0f5abd6236e9e558c26eb7efe9caca052259a8cc472de5d5f3511e57edb6629726af1223948cf5461771b0f603fb20523889003e60e"
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
