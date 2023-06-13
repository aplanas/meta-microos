SUMMARY = "A simple beamer theme"
DESCRIPTION = "The package provides a simple theme, similar to some others, \
but designed to be attractive."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn39100"

RPM_NAME = "texlive-beamertheme-phnompenh-2023.201.1.0svn39100-53.1.noarch.rpm"
RPM_HASH = "bf24d7bb166eb459edf53411202b9829b5dba316b549c57f8a91fc469ce86a8b5bc38f7fd7b7a3bb97dbed07c649e5d3d530f6a4ca1f23b620f4c97d3ea1b774"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamerthemePhnomPenh.sty) \
texlive-beamertheme-phnompenh"

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
texlive-scripts-bin"

inherit rpm
