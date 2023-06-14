SUMMARY = "Listings language driver for Bayesian modeling languages"
DESCRIPTION = "The package provides language drivers for the listings package \
for several languages not included in that package: BUGS, JAGS, \
and Stan."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn48160"

RPM_NAME = "texlive-lstbayes-2023.201.svn48160-52.1.noarch.rpm"
RPM_HASH = "d1e2ca44387aef425b66fcf9225b7ee9398d16803705ca0045045fa8d49b2c423255879558a09ad80caac3cc0c5e28e1b8f7087f2e68a80b339dad01f52d6a2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lstbayes.sty \
texlive-lstbayes"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
