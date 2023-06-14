SUMMARY = "MA Thesis class for the Department of Linguistics, University of Mumbai"
DESCRIPTION = "This is a class file for writing MA thesis as required by the \
Department of Linguistics at the University of Mumbai."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn61719"

RPM_NAME = "texlive-muling-2023.201.0.0.3svn61719-54.1.noarch.rpm"
RPM_HASH = "0efbc0773ad16dd5983700e415b2536bdcaad64cd39e0f6fe9ae29fc02d9b3ac4c97e31016f0946e6eb87e60b0071eb075206889a3b94556ca12218de8a09e1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-muling.cls \
texlive-muling"

RDEPENDS:${PN} += "/bin/sh \
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
