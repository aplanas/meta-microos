SUMMARY = "A Computer Modern Pica variant"
DESCRIPTION = "An approximate equivalent of the Xerox Pica typeface; the font \
is optimised for submitting fiction manuscripts to mainline \
publishers. The font is a fixed-width one, rather less heavy \
than Computer Modern typewriter. Emphasis for bold-face comes \
from a wavy underline of each letter. The two fonts are \
supplied as Metafont source."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-cmpica-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "39434a168beb83ad42e174b01413354c06aa1535bf8857e48f3656fab3d08af3c4a871e92c53bb905f79d1878f58aaaf6d7bf1a54cb1eaac0ada74ba9447fe4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmpica.tfm \
tex-cmpicab.tfm \
tex-cmpicati.tfm \
texlive-cmpica"

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
