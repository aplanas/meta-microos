SUMMARY = "Create scalebars for maps, diagrams or photos"
DESCRIPTION = "This is a small package to create scalebars for maps, diagrams \
or photos. It was designed for use with cave maps but can be \
used for anything from showing a scalebar in kilometres for \
topographic maps to a scalebar in micrometres for an electron \
microscope image."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-scalebar-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "0f2e459b4753d3df5d272cf82c949bcb0892349e0a1f5b1953ff575ebb63d48be9c610cc8642a1a63e4cb16bf315d9fdbf47602efa54edbba890de85ec2c3eb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scalebar.sty \
texlive-scalebar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fp.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
