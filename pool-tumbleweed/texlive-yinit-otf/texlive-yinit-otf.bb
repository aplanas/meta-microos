SUMMARY = "OTF conversion of Yannis Haralambous' Old German decorative initials"
DESCRIPTION = "This package is a conversion of the yinit font into OTF. \
Original Metafont files for yinit are in the yinit package."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn40207"

RPM_NAME = "texlive-yinit-otf-2023.209.1.0svn40207-53.1.noarch.rpm"
RPM_HASH = "fd76e9f44cfaec0dcc4e3c2d40441025f499711a8dc3b280f7d38a90f5dc1d9e445b0778f31b456ad5f5af6b37b22a6eec46191073de37d099dd27cff4792685"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yinit-otf"

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
texlive-yinit-otf-fonts"

inherit rpm
