SUMMARY = "'Tab' to a measured position in the line"
DESCRIPTION = "\\tabto{<length>} moves the typesetting position to <length> \
from the left margin of the paragraph. If the typesetting \
position is already further along, \\tabto starts a new line."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-tabto-generic-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "e6a1dbc7d0d381b35a487434ed5a803b56b517e82ed18b46bfffe10fcd14691da9bfd97b82d39b1009f54724db728a1dd0eda2ae71ed7f4de030472e1e442be5"
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
