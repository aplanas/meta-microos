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

PV = "2023.201.1.2.1svn43723"

RPM_NAME = "texlive-biblatex-claves-2023.201.1.2.1svn43723-53.1.noarch.rpm"
RPM_HASH = "a79632cc480ada92228da9af58741ecd4ee1bb252bfdd0cf2ab3a293bad0126e6e567bdc14eac1a8304b03ece8e1535cb34abe0e4318e3f0a5f2514356a67ba9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-claves.bbx \
texlive-biblatex-claves"

RDEPENDS:${PN} += "/bin/sh \
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
