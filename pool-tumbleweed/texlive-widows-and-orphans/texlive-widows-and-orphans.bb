SUMMARY = "Identify (typographic) widows and orphans"
DESCRIPTION = "This package identifies all widows and orphans in a document to \
help a user to get rid of them. The act of resolving still \
needs to be done manually: By rewriting text, running some \
paragraph long or short or or explicitly breaking in some \
strategic place. It will also identify and warn about words \
broken across columns or pages and display formulas separated \
from their introductory paragraph."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0esvn66532"

RPM_NAME = "texlive-widows-and-orphans-2023.209.1.0esvn66532-54.1.noarch.rpm"
RPM_HASH = "7295addc74b1831db38e616c0af1263794c779f9cf30ed65184a40686bdf98769048b2f36334bb56fb6bd2e0bcf063359a4f52d13f38c19c895fb5abd58f6e63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-widows-and-orphans.sty \
texlive-widows-and-orphans"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
