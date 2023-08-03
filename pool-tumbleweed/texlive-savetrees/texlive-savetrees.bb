SUMMARY = "Optimise the use of each page of a LaTeX document"
DESCRIPTION = "The goal of the savetrees package is to pack as much text as \
possible onto each page of a LaTeX document. Admittedly, this \
makes the document far less attractive. Nevertheless, savetrees \
is a simple way to save paper when printing draft copies of a \
document. It can also be useful when trying to meet a tight \
page-length requirement for a conference or journal submission. \
Most of the package options cover specific modifications to \
typesetting rules, but there are also options subtle, moderate \
and extreme options for the 'broad brush' approach."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4svn40525"

RPM_NAME = "texlive-savetrees-2023.209.2.4svn40525-54.1.noarch.rpm"
RPM_HASH = "f95c32bb232b2d625c69f8f68875be1309f58cd763a298034de7660f7af5b368854af4f314d331a28a88546f40d02a03e54e455ac013b0731bf07497542c0279"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-savetrees.bbx \
tex-savetrees.cbx \
tex-savetrees.sty \
texlive-savetrees"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-numeric-comp.bbx \
tex-numeric-comp.cbx \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
