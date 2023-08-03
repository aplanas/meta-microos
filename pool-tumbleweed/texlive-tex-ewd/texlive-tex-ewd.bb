SUMMARY = "Macros to typeset calculational proofs and programs in Dijkstra's style"
DESCRIPTION = "Edsger W. Dijkstra and others suggest a unique style to present \
mathematical proofs and to construct programs. This package \
provides macros that support calculational proofs and \
Dijkstra's 'guarded command language'."
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-tex-ewd-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "d3252e995e58ade15bb8e8dfbf4a54c3f4e2b2bed36e04544d620de8bf321b9fd0709320560669c7632781fdc556fa1cbb5bcf6f2d2f593318493d60274b4439"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dotnot.tex \
texlive-tex-ewd"

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
