SUMMARY = "Introduction to LaTeX in Portuguese"
DESCRIPTION = "This is the Portuguese translation of A Short Introduction to \
LaTeX2e."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.5.01.0svn55643"

RPM_NAME = "texlive-lshort-portuguese-2023.201.5.01.0svn55643-54.1.noarch.rpm"
RPM_HASH = "60c14016c7fdced35bcb6f4d3b791bc65b9ec453f61d68e68a8a3fc9b9218d70b17def14e5f36c0bed7a06fbc38408245758818efa5293ad7438eefa884182fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-portuguese"

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
