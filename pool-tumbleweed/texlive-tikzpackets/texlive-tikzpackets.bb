SUMMARY = "Display network packets"
DESCRIPTION = "This package allows you to easily display network packets \
graphically."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn55827"

RPM_NAME = "texlive-tikzpackets-2023.201.1.0svn55827-52.1.noarch.rpm"
RPM_HASH = "3dacfb6a60f2e14645a79ea810a5b7f220d49e09e6f66fe838995da5affe455b19a830b9ad2da5fda188faeb226919c2ce25cbf434fadb0a692a75ff3c70ee7f"
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
