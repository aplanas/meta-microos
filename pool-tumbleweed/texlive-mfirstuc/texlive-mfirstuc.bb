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

PV = "2023.209.2.08svn64743"

RPM_NAME = "texlive-mfirstuc-2023.209.2.08svn64743-55.1.noarch.rpm"
RPM_HASH = "738b54f3d8fd98bf067d7c5d85122ef030a6f2119d159a030af25d10e309ffca49f2e5c525332f5032cb7f14317ef1d5c58f56e50e402128c0cfb6e5e150cbe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mfirstuc-2021-10-15.sty \
tex-mfirstuc-english.sty \
tex-mfirstuc.sty \
texlive-mfirstuc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
