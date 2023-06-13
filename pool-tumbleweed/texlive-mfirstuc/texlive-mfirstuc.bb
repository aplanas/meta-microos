SUMMARY = "Uppercase the first letter of a word"
DESCRIPTION = "The package provides commands \\makefirstuc that uppercases the \
first letter in its argument (with a check for a semantic \
markup command at the start of the argument), and \\xmakefirstuc \
which expands the argument before uppercasing. It also provides \
\\capitalisewords{phrase} which applies \\makefirstuc to each \
word in the phrase, where the words are separated by regular \
spaces. (Exceptions can be made for words that shouldn't be \
converted.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.08svn64743"

RPM_NAME = "texlive-mfirstuc-2023.201.2.08svn64743-54.1.noarch.rpm"
RPM_HASH = "76e0b8d9b6fde467262f11312b9c999fbbf43a854e29c01b12a032599a399aa9a56f367dc869b52c120890cee4b0182a1b93488f0ac195c1d2314fbafe0f92fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mfirstuc-2021-10-15.sty) \
tex(mfirstuc-english.sty) \
tex(mfirstuc.sty) \
texlive-mfirstuc"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
