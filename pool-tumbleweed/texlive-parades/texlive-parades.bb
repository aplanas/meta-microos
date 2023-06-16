SUMMARY = "Tabulators and space between paragraphs in galley approach"
DESCRIPTION = "The LaTeX package paravesp controls the spaces above and below \
paragraphs. The python script parades.py generates paragraph \
styles with support of space above, space below and tabulators. \
The system imposes the galley approach on the document."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn40042"

RPM_NAME = "texlive-parades-2023.201.svn40042-51.1.noarch.rpm"
RPM_HASH = "99cfc7b7e90c2953ff0ec05f152daacc6acc1487e2e0a0b6f2e56060063cc64797f2bb3ace25375bfe29cd7dcb550de7ecb290c6d79c6cfbaaee4198803182be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-paravesp.sty \
texlive-parades"

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
