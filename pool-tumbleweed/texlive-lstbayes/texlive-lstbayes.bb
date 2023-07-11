SUMMARY = "Listings language driver for Bayesian modeling languages"
DESCRIPTION = "The package provides language drivers for the listings package \
for several languages not included in that package: BUGS, JAGS, \
and Stan."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn48160"

RPM_NAME = "texlive-lstbayes-2023.208.svn48160-53.1.noarch.rpm"
RPM_HASH = "9de93bc1b816d3c98d433036f7fd2bfdcee073be79231af26a75cf04c3b9a6ac37f10153ee2311b660bbacaf3750f93329bb2e6782297fa069e57cded8736b6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lstbayes.sty \
texlive-lstbayes"

RDEPENDS:${PN} += "/usr/bin/sh \
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
