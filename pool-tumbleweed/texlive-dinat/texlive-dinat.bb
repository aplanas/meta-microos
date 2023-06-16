SUMMARY = "Bibliography style for German texts"
DESCRIPTION = "Bibliography style files intended for texts in german. They \
draw up bibliographies in accordance with the german DIN 1505, \
parts 2 and 3."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.5svn15878"

RPM_NAME = "texlive-dinat-2023.201.2.5svn15878-52.1.noarch.rpm"
RPM_HASH = "3ff4d3f00581020296dfad197959f72e68897b94ed34fcfade312b73ef0d0a5134c9f5b5f702bb2b386804b3142cbe847579406f0acf04649b4220e97ad1c391"
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
