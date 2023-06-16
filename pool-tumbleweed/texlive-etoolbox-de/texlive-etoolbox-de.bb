SUMMARY = "German translation of documentation of etoolbox"
DESCRIPTION = "The version translated is 2.1 or 2011-01-03."
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn21906"

RPM_NAME = "texlive-etoolbox-de-2023.201.1svn21906-52.1.noarch.rpm"
RPM_HASH = "41d78f9ff8982a84f0754d983d7d28270ccd69c4d3c688ca7504bdd71b247085f36429d040c0606c7921e135b8ccddb2ed5c9b27cdc6798c341a2fe077071f7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etoolbox-de"

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
