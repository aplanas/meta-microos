SUMMARY = "Python script for counting words in OpTeX documents"
DESCRIPTION = "OpTeXcount is a basic python utility that analyzes OpTeX source \
code. It is inspired by already existing TeXcount for LaTeX. \
The functionality is really lightweight and basic. It counts \
words and other elements of OpTeX document and sorts them out \
into individual categories. Users can print the source code \
with highlighted words using several colors,so they see what is \
considered as word, header etc."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn59817"

RPM_NAME = "texlive-optexcount-2023.201.1.1svn59817-54.1.noarch.rpm"
RPM_HASH = "0fdef58db6d517db82be81205c5fae596df6089754f6b235b1a73dd8e4e8f2d82124d705a7933e90f740d4ba309cbca0315ef3d24154e69b1635e9e256d58f60"
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
