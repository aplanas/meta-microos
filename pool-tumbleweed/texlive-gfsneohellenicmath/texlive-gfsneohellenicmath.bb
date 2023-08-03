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

PV = "2023.209.1.02svn63928"

RPM_NAME = "texlive-gfsneohellenicmath-2023.209.1.02svn63928-53.1.noarch.rpm"
RPM_HASH = "025da9695debeb7d301d648b80f2c20190bf51475dc5b4348beaf66b8d90708094a337ced9afd8c33b3d82d130801a1aaef2f2f03e6bb9de1902cbbc56da59db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gfsneohellenicot.sty \
texlive-gfsneohellenicmath"

RDEPENDS:${PN} += "/usr/bin/sh \
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
