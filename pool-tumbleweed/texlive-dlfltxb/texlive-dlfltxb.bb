SUMMARY = "Macros related to 'Introdktion til LaTeX'"
DESCRIPTION = "The bundle contains various macros either used for creating the \
author's book 'Introduktion til LaTeX' (in Danish), or \
presented in the book as code tips. The bundle comprises: \
dlfltxbcodetips: various macros helpful in typesetting \
mathematics; dlfltxbmarkup: provides macros used throughout, \
for registering macro names, packages etc. in the text, in the \
margin and in the index, all by using categorised keys (note, a \
configuration file may be used; a sample is included in the \
distribution); dlfltxbtocconfig: macros for the two tables of \
contents that the book has; dlfltxbmisc: various macros for \
typesetting LaTeX arguments, and the macro used in the \
bibliography that can wrap a URL up into a BibTeX entry. \
Interested parties may review the book itself on the web at the \
author's institution (it is written in Danish)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17337"

RPM_NAME = "texlive-dlfltxb-2023.209.svn17337-53.1.noarch.rpm"
RPM_HASH = "612e67bc2e9d3d2d3eef37cc88b4b9ad69a01a41cdcbf5ee55fb79c4875cbc86c5b129c1113459ef081fc3d1e6a33c580d25926e7db0c90a543d511bfe9fdc38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dlfltxbcodetips.sty \
tex-dlfltxbmarkup.sty \
tex-dlfltxbmarkupbookkeys.sty \
tex-dlfltxbmisc.sty \
tex-dlfltxbtocconfig.sty \
texlive-dlfltxb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-calc.sty \
tex-chngpage.sty \
tex-graphicx.sty \
tex-keyval.sty \
tex-ragged2e.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
