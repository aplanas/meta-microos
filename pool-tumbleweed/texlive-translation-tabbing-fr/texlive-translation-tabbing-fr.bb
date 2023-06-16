SUMMARY = "French translation of the documentation of Tabbing"
DESCRIPTION = "A translation to French (by the author) of the documentation of \
the Tabbing package."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn24228"

RPM_NAME = "texlive-translation-tabbing-fr-2023.201.svn24228-52.1.noarch.rpm"
RPM_HASH = "8ff858963c415959ce81373aaaea82bcdc581e77cd623542cba874ff345cf0d2ac4a207c359280f050d1a922fc104992c422ba9fec4b3d4e99c64ada1360901e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-tabbing-fr"

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
