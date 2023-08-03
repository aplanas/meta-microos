SUMMARY = "Curriculum vitae for French use"
DESCRIPTION = "The package allows the user to set up a curriculum vitae as a \
French employer will expect."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn59638"

RPM_NAME = "texlive-esieecv-2023.209.svn59638-54.1.noarch.rpm"
RPM_HASH = "bede2fc7f82753bc51d890cc93d5ccbef4873d34ad038eea7fc8399a0b92de9fb98783fdb568c1f88c9283b8e970528a80c0e396b456e295f8ce763d1e62a5ec"
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
