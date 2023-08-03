SUMMARY = "A font to draw a skull"
DESCRIPTION = "The font (defined in Metafont) defines a single character, a \
black solid skull. A package is supplied to make this character \
available as a symbol in maths mode."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.1svn51907"

RPM_NAME = "texlive-skull-2023.209.0.0.1svn51907-58.1.noarch.rpm"
RPM_HASH = "dd56d3ce6b71391da59f773bc095f5fd52f345c9d14e3495bc6a9e40ad3d44d8da262dcb50cee002a993ed115aa318c2005e712e7fc9f57c2c31109e36247652"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-skull.sty \
tex-skull.tfm \
texlive-skull"

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
