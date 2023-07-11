SUMMARY = "Curriculum vitae for French use"
DESCRIPTION = "The package allows the user to set up a curriculum vitae as a \
French employer will expect."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59638"

RPM_NAME = "texlive-esieecv-2023.201.svn59638-53.2.noarch.rpm"
RPM_HASH = "3a65fcea95905140fdfca65fdc80d3b598f01f47de3b7fa345e7b766b98bd5c52e797485d92d9e4e834c98437c78507fa96033007687db3fea4987fc350c101e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ESIEEcv.sty \
texlive-esieecv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
