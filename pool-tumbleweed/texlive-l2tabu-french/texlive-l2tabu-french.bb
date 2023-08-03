SUMMARY = "French translation of l2tabu"
DESCRIPTION = "French translation of l2tabu."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.3svn31315"

RPM_NAME = "texlive-l2tabu-french-2023.209.2.3svn31315-56.1.noarch.rpm"
RPM_HASH = "032d70f95b643e35e05c79c94adc24b17bd7915d2dad341ac3a2cb62fac32dea4a32045d45c3ef0e92f1759fc97aab0947054ba05fa69922ae8f25054f947941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l2tabu-french"

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
