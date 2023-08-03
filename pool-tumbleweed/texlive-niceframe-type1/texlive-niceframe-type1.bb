SUMMARY = "Type 1 versions of the fonts recommended in niceframe"
DESCRIPTION = "The bundle provides Adobe Type 1 versions of the fonts \
bbding10, dingbat, karta15, umranda and umrandb."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn44671"

RPM_NAME = "texlive-niceframe-type1-2023.209.svn44671-55.1.noarch.rpm"
RPM_HASH = "fed19eb3ee0b13fbc6b37069d5e686ffc392b3dbcef5b3c94fc8a2343a2da512177ff5a8255eb74829d4ebbaff37fcb270b304f6244a903df44053e7aedabb50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-niceframe.map \
texlive-niceframe-type1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-niceframe-type1-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
