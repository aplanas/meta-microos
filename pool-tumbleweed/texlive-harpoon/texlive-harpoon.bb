SUMMARY = "Extra harpoons, using the graphics package"
DESCRIPTION = "Provides over- and under-harpoon symbol commands; the harpoons \
may point in either direction, with the hook pointing up or \
down. The covered object is provided as an argument to the \
commands, so that they have the look of accent commands."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn21327"

RPM_NAME = "texlive-harpoon-2023.201.1.0svn21327-53.2.noarch.rpm"
RPM_HASH = "4543a8c5cfd3715a815ed67bcfc2b57c70ef1bd9b363e14ca6d485fd878c6179b3280239a0a2c234175d4b1d10a6d8544c3b6948d8945f103a00cb95b8249a09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-harpoon.sty \
texlive-harpoon"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
