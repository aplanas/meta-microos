SUMMARY = "A math font in the Neo-Hellenic style"
DESCRIPTION = "The GFSNeohellenic font, a historic font first designed by \
Victor Scholderer, and digitized by George Matthiopoulos of the \
Greek Font Society (GFS), now has native support for \
Mathematics. The project was commissioned to GFS by the \
Department of Mathematics of the University of the Aegean, \
Samos, Greece. The Math Table was constructed by the \
Mathematics Professor A. Tsolomitis. A useful application is in \
beamer documents since this is a Sans Math font. The \
GFSNeohellenic fontfamily supports many languages (including \
Greek), and it is distributed (both text and math) under the \
OFL license."
LICENSE = "OFL-1.1"

PV = "2023.201.1.02svn63928"

RPM_NAME = "texlive-gfsneohellenicmath-2023.201.1.02svn63928-52.1.noarch.rpm"
RPM_HASH = "a298a32f9a5a6c3043cccc3a09b03c9300b3213c827f4b605d64a012876f6d1d8b3bde236e45b72c71b0c6fb38b3c0eae63ba296a18f609865762eb4fcee7c04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gfsneohellenicot.sty \
texlive-gfsneohellenicmath"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-unicode-math.sty \
texlive \
texlive-filesystem \
texlive-gfsneohellenicmath-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
