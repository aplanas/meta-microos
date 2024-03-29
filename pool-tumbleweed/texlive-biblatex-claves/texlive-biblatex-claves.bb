SUMMARY = "A tool to manage claves of old litterature with BibLaTeX"
DESCRIPTION = "When studying antic and medieval literature, we may find many \
different texts published with the same title, or, in contrary, \
the same text published with different titles. To avoid \
confusion, scholars have published claves, which are books \
listing ancient texts, identifying them by an identifier -- a \
number or a string of text. For example, for early \
Christianity, we have the Bibliotheca Hagiographica Graeca, the \
Clavis Apocryphorum Novi Testamenti and other claves. It could \
be useful to print the identifier of a texts in one specific \
clavis, or in many claves. The package allows us to create new \
field for different claves, and to present all these fields in \
a consistent way."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.1svn43723"

RPM_NAME = "texlive-biblatex-claves-2023.209.1.2.1svn43723-54.1.noarch.rpm"
RPM_HASH = "eb2b7b8fd27b1ec10af76e25ac89cd4f9adae1236e8f08c96ec7e0373a7e92b11b924d8983db1997f06a7204a39b92b185a947b2374990a6cbedfa0f4b1a848d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-claves.bbx \
texlive-biblatex-claves"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
