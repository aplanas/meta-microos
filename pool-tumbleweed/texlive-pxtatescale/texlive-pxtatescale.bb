SUMMARY = "Patch to graphics driver for scaling in vertical direction of pTeX"
DESCRIPTION = "Patch for graphics driver 'dvipdfmx' to support correct scaling \
in vertical direction of Japanese pTeX/upTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn63967"

RPM_NAME = "texlive-pxtatescale-2023.209.0.0.4svn63967-54.2.noarch.rpm"
RPM_HASH = "7ecb10ceb9e582c414497912fb79672017c1e6118cf4785bb09fe1cebc58ad89c31edd83ee1f31fcf681dbfd41b28b57facee396f3a401425ec6fc7b978882a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pxtatescale.sty \
texlive-pxtatescale"

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
