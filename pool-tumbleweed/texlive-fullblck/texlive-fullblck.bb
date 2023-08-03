SUMMARY = "Left-blocking for letter class"
DESCRIPTION = "Used with the letter documentclass to set the letter in a \
fullblock style (everything at the left margin)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn25434"

RPM_NAME = "texlive-fullblck-2023.209.1.03svn25434-53.1.noarch.rpm"
RPM_HASH = "321a234c9e26885d237909c2d5a90e5b9efe0aefbb797e0937b2057974f07f314bd35454dcbd26f448b45abfaf82764cc07b7284c5057e8e0c8bd986c9452e56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fullblck.sty \
texlive-fullblck"

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
