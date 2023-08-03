SUMMARY = "Typeset syntactic trees"
DESCRIPTION = "A package to typeset syntactic trees such as those used in \
Chomsky's Generative grammar, based on a description of the \
structure of the tree."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4.2svn16252"

RPM_NAME = "texlive-synttree-2023.209.1.4.2svn16252-58.1.noarch.rpm"
RPM_HASH = "5e0b5c3a65d12341f90308545dc6c2be152720d997750add4a386df4969502737ef9498aa24b4768aeb81fb56f2c9113957c667c9c8f8a80df9162a12049b8ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-synttree.sty \
texlive-synttree"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
