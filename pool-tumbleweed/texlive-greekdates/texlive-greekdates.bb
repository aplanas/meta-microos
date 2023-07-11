SUMMARY = "Provides ancient Greek day and month names, dates, etcetera"
DESCRIPTION = "The package provides easy access to ancient Greek names of days \
and months of various regions of Greece. In case the historical \
information about a region is not complete, we use the Athenian \
name of the month. Moreover commands and options are provided, \
in order to completely switch to the 'ancient way', commands \
such as \\today."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-greekdates-2023.201.1.0svn15878-53.2.noarch.rpm"
RPM_HASH = "6714aad390d440233d7ed026980af6083d1ae1a603082f601a3ac52b46f4e7349328c0b43a91480ade7a8cd7ab0e4f50d9e81a32f31b26679bcdb1227e60ffaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-greekdates.sty \
texlive-greekdates"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
