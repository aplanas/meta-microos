SUMMARY = "Twemoji font in COLR/CPAL layered format"
DESCRIPTION = "This is a COLR/CPAL-based color OpenType font from the Twemoji \
collection of emoji images."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7.0svn64854"

RPM_NAME = "texlive-twemoji-colr-2023.201.0.0.7.0svn64854-52.1.noarch.rpm"
RPM_HASH = "bb07ffcca7cac52b1540715a4a2ebe46f9f7b4bd33a64dcb4b0a3f76932ed98dcd7d6787e1394644844e548aadf943eb0edcd2164d3cc7b82077e2d99d79ed63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-twemoji-colr"
RDEPENDS:${PN} += "/bin/sh \
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
texlive-scripts-bin \
texlive-twemoji-colr-fonts"

inherit rpm
