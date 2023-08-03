SUMMARY = "MA Thesis class for the Department of Linguistics, University of Mumbai"
DESCRIPTION = "This is a class file for writing MA thesis as required by the \
Department of Linguistics at the University of Mumbai."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn61719"

RPM_NAME = "texlive-muling-2023.209.0.0.3svn61719-55.1.noarch.rpm"
RPM_HASH = "4f15db94bf319aaa5fb531648eab76b3cbac8d0515b6c8c7790e3024ff506b0a83614b9003f743ca247d87e6f90827dd58a28fc86c840eefa1c53017acbc5186"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-muling.cls \
texlive-muling"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biblatex.sty \
tex-book.cls \
tex-expex.sty \
tex-fancyhdr.sty \
tex-forest.sty \
tex-hyperref.sty \
tex-leipzig.sty \
tex-ling-macros.sty \
tex-tipa.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
