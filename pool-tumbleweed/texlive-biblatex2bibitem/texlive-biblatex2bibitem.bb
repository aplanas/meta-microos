SUMMARY = "Convert BibLaTeX-generated bibliography to bibitems"
DESCRIPTION = "Some journals accept the reference list only as \\bibitems. If \
you use BibTeX, there is no problem: just paste the content of \
the .bbl file into your document. However, there was no \
out-of-the-box way to do the same for biblatex, and you had to \
struggle with searching appropriate .bst files, or formatting \
your reference list by hand, or something like that. Using the \
workaround provided by this package solves the problem."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.2svn61648"

RPM_NAME = "texlive-biblatex2bibitem-2023.209.0.0.2.2svn61648-54.1.noarch.rpm"
RPM_HASH = "0caeb55e42be85f59349ab1406b7ce1cc464ec3371e0cff01f4769ed530346e3279e050d14de35eb7790849d8791261c340b5e575ad59e8417872edd45964019"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex2bibitem.sty \
texlive-biblatex2bibitem"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biblatex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
