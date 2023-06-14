SUMMARY = "Draw arrows using PGF/TikZ"
DESCRIPTION = "In a document with a lot of diagrams created with PGF/TikZ, \
there is a possibility of the reader being distracted by \
different sorts of arrowheads in the diagrams and in the text \
(as, e.g., in \\rightarrow). The package defines macros to \
create all arrows using PGF/TikZ, so as to avoid the problem."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn25777"

RPM_NAME = "texlive-tikzpfeile-2023.201.1.0svn25777-52.1.noarch.rpm"
RPM_HASH = "5ca8ac5c8ae640edacf3d62062e8b09fe0f4b683a794cefd9d68c5c1d71d2d804ccfd9f53c098c70643787e90bf5f18472e113e66483fa788016728ee7343809"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzpfeile.sty \
texlive-tikzpfeile"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
