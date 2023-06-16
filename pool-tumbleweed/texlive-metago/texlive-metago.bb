SUMMARY = "MetaPost output of Go positions"
DESCRIPTION = "The package allows you to draw Go game positions with MetaPost. \
Two methods of usage are provided, either using the package \
programmatically, or using the package via a script (which may \
produce several images)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9svn15878"

RPM_NAME = "texlive-metago-2023.201.0.0.9svn15878-54.1.noarch.rpm"
RPM_HASH = "e05c48a9907da026a251dcd8a1d197b5ccb2bff6dd3a8490ad108a53fc03e3292f9baa960bc638931277aa91a53ee0e6adbdf484a10980aff9ecde4ad8ff1d26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metago"

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
