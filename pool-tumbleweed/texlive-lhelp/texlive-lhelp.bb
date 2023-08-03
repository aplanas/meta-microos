SUMMARY = "Miscellaneous helper packages"
DESCRIPTION = "This package defines macros which are useful for many \
documents. It is a large collection of simple 'little helpers' \
which do not really warrant a separate package on their own. \
Included are, among other things, definitions of common units \
with preceeding thinspaces, framed boxes where both width and \
height can be specified, starting new odd or even pages, draft \
markers, notes, conditional includes, including EPS files, and \
versions of enumerate and itemize which allow the horizontal \
and vertical spacing to be changed."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.0svn23638"

RPM_NAME = "texlive-lhelp-2023.209.2.0svn23638-55.1.noarch.rpm"
RPM_HASH = "4b05bccdc1b9ed9c9fa8bda052c2e2ab4ece24a2658a61f230a6df65897d85e14d7b1f97812e78e73cc27dac57df201aaa7f6c22ffe27c21557d6607d67aa804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lhelp.sty \
texlive-lhelp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
