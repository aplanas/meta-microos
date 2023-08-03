SUMMARY = "Bulgarian translation of the pst-eucl documentation"
DESCRIPTION = "The pst-eucl package documentation in Bulgarian language - \
Euclidean Geometry with PSTricks."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.2svn19296"

RPM_NAME = "texlive-pst-eucl-translation-bg-2023.209.1.3.2svn19296-53.1.noarch.rpm"
RPM_HASH = "f7427a49e24fee7310cdbcf068556c52386d2509d1d2b378d5b2fcbdd066f2f14e3f8fbd37b843c45293112f6212fcd44d4dee472f20d9a06382e3c1a99f9836"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-eucl-translation-bg"

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
