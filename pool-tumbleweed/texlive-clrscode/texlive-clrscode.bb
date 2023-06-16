SUMMARY = "Typesets pseudocode as in Introduction to Algorithms"
DESCRIPTION = "This package allows you to typeset pseudocode in the style of \
Introduction to Algorithms, Second edition, by Cormen, \
Leiserson, Rivest, and Stein. The package was written by the \
authors. You use the commands the same way the package's author \
did when writing the book, and your output will look just like \
the pseudocode in the text."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn51136"

RPM_NAME = "texlive-clrscode-2023.201.1.7svn51136-53.1.noarch.rpm"
RPM_HASH = "d63412e0cab164157a8355e023099fbc3c4324781891a9361e759c8d2a1634538233bce16de6e17f2d3b59f9552093b2368d3d3c29900d4cd545f215b1dba1ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-clrscode.sty \
texlive-clrscode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-latexsym.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
