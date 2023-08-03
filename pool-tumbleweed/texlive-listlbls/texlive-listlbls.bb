SUMMARY = "Creates a list of all labels used throughout a document"
DESCRIPTION = "The package aims to help a LaTeX author to keep track of all \
defined labels by typesetting a complete list of labels \
wherever the author requests it. (Of course, the user may need \
to have additional LaTeX runs to get the references right. ) \
This package is based on an answer David Carlisle gave on \
TeX/Stackexchange in the thread 'List of all labels with \
hyperlinks'."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn34893"

RPM_NAME = "texlive-listlbls-2023.209.1.03svn34893-55.1.noarch.rpm"
RPM_HASH = "a0eb3d9b189c837de924982a019cc9417dcc54d8d327a435504602b27e12a15bc511af0a2e1c7714b820cfe4c137ad6f50cbfaf9283845b3163b67b090af8ddd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-listlbls.sty \
texlive-listlbls"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-translations.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
