SUMMARY = "A French translation of 'latex2e-help-texinfo'"
DESCRIPTION = "This package provides a complete French translation of \
latex2e-help-texinfo."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn64228"

RPM_NAME = "texlive-latex2e-help-texinfo-fr-2023.201.svn64228-54.1.noarch.rpm"
RPM_HASH = "93d8afc455199faf827dbe6b2c6936398a31b370af76f45decd36d3f6fdd29ab510746d027c41e01ea1ef534ebeef378a237c9ef3faab3712dea87ff5f5bb21f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex2e-help-texinfo-fr"

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
