SUMMARY = "Include EPS figures in MetaPost"
DESCRIPTION = "Exteps is a module for including external EPS figures into \
MetaPost figures. It is written entirely in MetaPost, and does \
not therefore require any post processing of the MetaPost \
output."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.41svn19859"

RPM_NAME = "texlive-exteps-2023.201.0.0.41svn19859-52.1.noarch.rpm"
RPM_HASH = "c6525bd546b5b957b26e810997100764304a9672f0c2734d7b124d7a2836f7d29bed4c8bb45e877ce32c8f560db2440a0315c80eb371b0aeb8f51875ffc14d98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exteps"

RDEPENDS:${PN} += "/bin/sh \
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
