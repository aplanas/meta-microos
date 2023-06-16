SUMMARY = "French translation of the documentation of natbib"
DESCRIPTION = "A French translation of the documentation of natbib."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn25105"

RPM_NAME = "texlive-translation-natbib-fr-2023.201.svn25105-52.1.noarch.rpm"
RPM_HASH = "c6037523b1e3090686b62815cfe97c52bf824c48d4a76d5455b602be1d2ac51e13daccba0805a28e38485b470bff95d213d8b565023776b659a3b2dd8532e1f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-natbib-fr"

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
