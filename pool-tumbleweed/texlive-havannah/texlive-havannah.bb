SUMMARY = "Diagrams of board positions in the games of Havannah and Hex"
DESCRIPTION = "This package defines macros for typesetting diagrams of board \
positions in the games of Havannah and Hex."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn36348"

RPM_NAME = "texlive-havannah-2023.209.svn36348-54.1.noarch.rpm"
RPM_HASH = "e83fbfad346b6aa08dcf88fd89ce6bba20fb479d6d3eae7b07d22e637400f0ffe8bfd0ce14d76c09623b27c2b6bd6056a82c26423a337b720257baa69194ae41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-havannah.sty \
texlive-havannah"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
