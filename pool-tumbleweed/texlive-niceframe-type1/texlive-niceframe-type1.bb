SUMMARY = "Type 1 versions of the fonts recommended in niceframe"
DESCRIPTION = "The bundle provides Adobe Type 1 versions of the fonts \
bbding10, dingbat, karta15, umranda and umrandb."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn44671"

RPM_NAME = "texlive-niceframe-type1-2023.201.svn44671-54.1.noarch.rpm"
RPM_HASH = "41b6310bb0c655dc3809d42788972c76a2eb5d47fda8299369600a708a7a427105d7680cd461bd0c41b9c767994e57b88a6078265ea99d04c1a926785d4a1cb4"
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
