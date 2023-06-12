SUMMARY = "Create 'railroad' syntax diagrams"
DESCRIPTION = "This package provides TikZ styles for creating special syntax \
diagrams known as 'railroad' diagrams. The package was \
originally distributed as part of the schule bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8.2svn56685"

RPM_NAME = "texlive-syntaxdi-2023.201.0.0.8.2svn56685-57.1.noarch.rpm"
RPM_HASH = "433ea49d39a672dd7c34e9bcb63b735b99aaea81b155148891e52448e1129c729f92ccd3fba27c99e63066fadb7e60012817a01eb1199ca2e75bdf74ab3306c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(syntaxdi.sty) \
texlive-syntaxdi"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
