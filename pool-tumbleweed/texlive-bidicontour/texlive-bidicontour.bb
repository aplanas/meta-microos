SUMMARY = "Bidi-aware coloured contour around text"
DESCRIPTION = "The package is a re-implementation of the contour package, \
making it bidi-aware, and adding support of the xdvipdfmx (when \
the outline option of the package is used)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn34631"

RPM_NAME = "texlive-bidicontour-2023.201.0.0.2svn34631-53.1.noarch.rpm"
RPM_HASH = "ab4b71c0d47294b26f14447ac430ef99be1802cb88daab839b66e44d9d165ffb36589948a17054a63091c32b993899a3041447a9ce664c9e7983fc41206ac9a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bidicontour.sty) \
texlive-bidicontour"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(color.sty) \
tex(trig.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
