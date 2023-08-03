SUMMARY = "Baekmuk Korean TrueType fonts"
DESCRIPTION = "This bundle consists of four Korean fonts: batang.ttf: serif \
dotum.ttf: sans-serif gulim.ttf: sans-serif (rounded) \
hline.ttf: headline These fonts were originally retrieved from \
http://kldp.net/baekmuk/ and are no longer maintained."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2.1svn56915"

RPM_NAME = "texlive-baekmuk-2023.209.2.2.1svn56915-54.1.noarch.rpm"
RPM_HASH = "96e87a1b3dd5834456550b62aa5c76737b06ac2d0f41ad0f5e8ca28f0144e78d7f4df365c82d801d36aa29d9cf8bc4f9a30bf3d56a80d29ec6ec0b6acb84c779"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-baekmuk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-baekmuk-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
