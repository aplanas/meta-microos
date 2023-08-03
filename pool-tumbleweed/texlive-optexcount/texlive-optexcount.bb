SUMMARY = "Python script for counting words in OpTeX documents"
DESCRIPTION = "OpTeXcount is a basic python utility that analyzes OpTeX source \
code. It is inspired by already existing TeXcount for LaTeX. \
The functionality is really lightweight and basic. It counts \
words and other elements of OpTeX document and sorts them out \
into individual categories. Users can print the source code \
with highlighted words using several colors,so they see what is \
considered as word, header etc."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn59817"

RPM_NAME = "texlive-optexcount-2023.209.1.1svn59817-55.1.noarch.rpm"
RPM_HASH = "d1b81746485cac2df654d43655d71ec82386af20e0960123d4da8783b0cf5c61d525522d7db7ee44adeef1b0bc399da815010c183f86eb2f7df206dc5aafd2ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-optexcount"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-optexcount-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
