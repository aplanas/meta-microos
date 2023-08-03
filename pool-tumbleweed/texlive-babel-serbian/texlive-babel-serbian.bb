SUMMARY = "Babel/Polyglossia support for Serbian"
DESCRIPTION = "The package provides support for Serbian documents written in \
Latin, in babel."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2asvn64571"

RPM_NAME = "texlive-babel-serbian-2023.209.2.2asvn64571-54.1.noarch.rpm"
RPM_HASH = "46fa3dafc5dd4d628647ce64771239f11f775a931bdaf5ccf6db24dd6c06a9e67a976eebaccf27d0b795b39d1cb248a4fd83890d4a8d74a68c87baf08b127cab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-serbian.ldf \
texlive-babel-serbian"

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
