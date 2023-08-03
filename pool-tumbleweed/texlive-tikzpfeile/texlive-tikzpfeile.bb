SUMMARY = "Draw arrows using PGF/TikZ"
DESCRIPTION = "In a document with a lot of diagrams created with PGF/TikZ, \
there is a possibility of the reader being distracted by \
different sorts of arrowheads in the diagrams and in the text \
(as, e.g., in \\rightarrow). The package defines macros to \
create all arrows using PGF/TikZ, so as to avoid the problem."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn25777"

RPM_NAME = "texlive-tikzpfeile-2023.209.1.0svn25777-53.1.noarch.rpm"
RPM_HASH = "ed233d0f1d151a58352fbc3e04e83d87b987726d103e83717e848f57054e50fbf4c27aea3309604be21141662c5e8edc36b7feec7ab1d017a5ab876131025655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzpfeile.sty \
texlive-tikzpfeile"

RDEPENDS:${PN} += "/usr/bin/sh \
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
