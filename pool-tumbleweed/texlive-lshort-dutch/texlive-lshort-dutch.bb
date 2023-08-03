SUMMARY = "Introduction to LaTeX in Dutch"
DESCRIPTION = "This is the Dutch (Nederlands) translation of the Short \
Introduction to LaTeX2e."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3svn15878"

RPM_NAME = "texlive-lshort-dutch-2023.209.1.3svn15878-55.1.noarch.rpm"
RPM_HASH = "b43543acfb53260c5cf80b25fc9ee8aa0f38726dac83d833b2a253a7720037ff5fb4be35fc8f320e4431157abdb219f23d3188c53991859ad0be851a24031b87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-dutch"

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
