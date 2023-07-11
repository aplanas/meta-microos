SUMMARY = "Utility programs for Polish users of TeX"
DESCRIPTION = "Provided as sources, not installed in the bin directories."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-gustprog-2023.201.svn54074-53.2.noarch.rpm"
RPM_HASH = "8dfc35c7f5ec1e1b9156c40ca919d8ecf70fe7a1a740ee9ada9af122992e9a49657d9de101f6bf5cc05125611c11d6ae7653ff13493b2e2ab37c3fd974b76500"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gustprog"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/perl \
/usr/bin/sh \
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
