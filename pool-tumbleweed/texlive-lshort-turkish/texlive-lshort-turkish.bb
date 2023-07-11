SUMMARY = "Turkish introduction to LaTeX"
DESCRIPTION = "A Turkish translation of Oetiker's (not so) short introduction."
LICENSE = "SUSE-Public-Domain"

PV = "2023.208.4.20svn15878"

RPM_NAME = "texlive-lshort-turkish-2023.208.4.20svn15878-53.1.noarch.rpm"
RPM_HASH = "8a21878c6103d59d6aef7e707d4fb44bb60af629abe82c48e53618b680ceb403dde442c54ee95d008b477cae8c76d9984ede93366947f69867721e7530f7a2cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-turkish"

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
