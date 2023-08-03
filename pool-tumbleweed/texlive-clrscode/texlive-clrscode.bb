SUMMARY = "Typesets pseudocode as in Introduction to Algorithms"
DESCRIPTION = "This package allows you to typeset pseudocode in the style of \
Introduction to Algorithms, Second edition, by Cormen, \
Leiserson, Rivest, and Stein. The package was written by the \
authors. You use the commands the same way the package's author \
did when writing the book, and your output will look just like \
the pseudocode in the text."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn51136"

RPM_NAME = "texlive-clrscode-2023.209.1.7svn51136-54.1.noarch.rpm"
RPM_HASH = "369cde5991a61e88520bb95929aa393c54e48bfe379376b9a0745698148e5d13f554aa58746086b54461a25abac875dbeac7f87883a2c167063db4ce53a023ab"
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
