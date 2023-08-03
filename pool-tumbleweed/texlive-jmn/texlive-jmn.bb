SUMMARY = "Special fonts for ConTeXt"
DESCRIPTION = "The jmn package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45751"

RPM_NAME = "texlive-jmn-2023.209.svn45751-56.1.noarch.rpm"
RPM_HASH = "106fbd3a41906139e2a1f266fff252224cc43e059f7173f8e329c7d965150ce736ab032957a6d4b545f81e2c78d9f6762f5eeedfc9bfa8081624248b61fc377d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hans-sh.tfm \
tex-hans.enc \
tex-hans.map \
tex-hans.tfm \
texlive-jmn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-jmn-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
