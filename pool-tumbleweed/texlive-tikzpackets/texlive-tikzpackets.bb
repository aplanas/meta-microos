SUMMARY = "Display network packets"
DESCRIPTION = "This package allows you to easily display network packets \
graphically."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn55827"

RPM_NAME = "texlive-tikzpackets-2023.209.1.0svn55827-53.1.noarch.rpm"
RPM_HASH = "a00658b88cd3e1ec46d0ff6333b0307056dd932bb46cdc3df4b9bb8689ce9f35858b2d9de9e84d8e063beb742a462eb4afd4f776c89bd8cf4a3f396f061312ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzPackets.sty \
texlive-tikzpackets"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pbox.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
