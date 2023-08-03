SUMMARY = "'Tab' to a measured position in the line"
DESCRIPTION = "\\tabto{<length>} moves the typesetting position to <length> \
from the left margin of the paragraph. If the typesetting \
position is already further along, \\tabto starts a new line."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-tabto-generic-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "91e1a32f6eabc987381ab05f7b6814b2695c56ff11bb5050b532d75b257424d95006b3b2c4ff775aa6d6128a88efdbe66e93fa09f2d066c06f4937b25854aed1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabto.tex \
texlive-tabto-generic"

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
