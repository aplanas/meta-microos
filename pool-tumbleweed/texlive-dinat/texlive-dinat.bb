SUMMARY = "Bibliography style for German texts"
DESCRIPTION = "Bibliography style files intended for texts in german. They \
draw up bibliographies in accordance with the german DIN 1505, \
parts 2 and 3."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.5svn15878"

RPM_NAME = "texlive-dinat-2023.209.2.5svn15878-53.1.noarch.rpm"
RPM_HASH = "316aba891f5be9379dfd4958541d74fd5e2a49bef78f729b31933ba88ab33645d743ce0334304a1c74065137faa5112c129a5cce6d459d29a12ee34efd95bebb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dinat"

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
