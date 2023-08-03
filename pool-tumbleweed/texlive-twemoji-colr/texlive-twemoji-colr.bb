SUMMARY = "Twemoji font in COLR/CPAL layered format"
DESCRIPTION = "This is a COLR/CPAL-based color OpenType font from the Twemoji \
collection of emoji images."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7.0svn64854"

RPM_NAME = "texlive-twemoji-colr-2023.209.0.0.7.0svn64854-53.1.noarch.rpm"
RPM_HASH = "35b22ad39026c87bbd88a02f06b19bfc2cb54090a0d598b99e8ac0f6861afe8b5a4721c7478ce8797fb24b50b3f72376a815b328921a1a9812ea6f0de63f950e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-twemoji-colr"

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
texlive-scripts-bin \
texlive-twemoji-colr-fonts"

inherit rpm
