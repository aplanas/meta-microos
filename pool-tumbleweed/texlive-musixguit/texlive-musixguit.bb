SUMMARY = "Easy notation for guitar music, in MusixTeX"
DESCRIPTION = "The package provides commands for typesetting notes for guitar, \
especially for simplifying guitar notation with MusixTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.2svn21649"

RPM_NAME = "texlive-musixguit-2023.209.1.2.2svn21649-55.1.noarch.rpm"
RPM_HASH = "de19dabdadf4f78e1290a0567e10c9af54311031b2626c44ef7150751fc79e1a7fb67417b46fd3028d2872f7f1f2659deb21ca179dee53ea1f2e50befa1a4308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-musixguit.sty \
texlive-musixguit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-musixgui.tex \
tex-musixper.tex \
tex-musixtex.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
