SUMMARY = "Easy notation for guitar music, in MusixTeX"
DESCRIPTION = "The package provides commands for typesetting notes for guitar, \
especially for simplifying guitar notation with MusixTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.2svn21649"

RPM_NAME = "texlive-musixguit-2023.201.1.2.2svn21649-54.1.noarch.rpm"
RPM_HASH = "a088943f6736e89058cb7f804e376def603db87d9dd3b8582343c6edd42c689d3b7a0e4af498201a24a00257cb1d782c3879eb2a9e6c81b89a0d16bdfdd1d61f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-musixguit.sty \
texlive-musixguit"

RDEPENDS:${PN} += "/bin/sh \
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
