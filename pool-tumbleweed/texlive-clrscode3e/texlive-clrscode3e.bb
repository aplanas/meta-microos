SUMMARY = "Typesets pseudocode as in Introduction to Algorithms"
DESCRIPTION = "This package allows you to typeset pseudocode in the style of \
Introduction to Algorithms, Third edition, by Cormen, \
Leiserson, Rivest, and Stein. The package was written by the \
authors. Use the commands the same way the package's author did \
when writing the book, and your output will look just like the \
pseudocode in the text."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn51137"

RPM_NAME = "texlive-clrscode3e-2023.201.svn51137-53.1.noarch.rpm"
RPM_HASH = "e85f75d93eb75ebdc67032f5bf9ee0e22904d541c701913555f92e72e0f503221f907fb18bcdafeda40afb8d8bcecaa45d7f5a5289375d7c6726b1f567cfb73c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-clrscode3e.sty \
texlive-clrscode3e"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
