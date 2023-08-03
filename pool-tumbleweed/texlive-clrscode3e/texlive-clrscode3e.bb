SUMMARY = "Typesets pseudocode as in Introduction to Algorithms"
DESCRIPTION = "This package allows you to typeset pseudocode in the style of \
Introduction to Algorithms, Third edition, by Cormen, \
Leiserson, Rivest, and Stein. The package was written by the \
authors. Use the commands the same way the package's author did \
when writing the book, and your output will look just like the \
pseudocode in the text."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn51137"

RPM_NAME = "texlive-clrscode3e-2023.209.svn51137-54.1.noarch.rpm"
RPM_HASH = "d819f1473993ae1c258c8ed0c67700153468ffa9c8bfa548739704ef9bc347cedc807e53c9be7d8be8ab1604ba6b3818211a19f235f8c9ac9bc30bb7284a8f2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-clrscode3e.sty \
texlive-clrscode3e"

RDEPENDS:${PN} += "/usr/bin/sh \
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
