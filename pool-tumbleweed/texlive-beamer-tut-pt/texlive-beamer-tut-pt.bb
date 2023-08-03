SUMMARY = "An introduction to the Beamer class, in Portuguese"
DESCRIPTION = "The beamer-tut-pt package"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-beamer-tut-pt-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "f59cd3f101e7d37c643c3920e15c61e414ea9edf3f37282c9ad77406ba3dab12dbf6be2296b13b0c43e86609d10223aeb8e21c3ec60217a7b0744c89174e5ac3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamer-tut-pt"

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
