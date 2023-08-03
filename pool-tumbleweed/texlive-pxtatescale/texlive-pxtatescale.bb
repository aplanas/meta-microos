SUMMARY = "Patch to graphics driver for scaling in vertical direction of pTeX"
DESCRIPTION = "Patch for graphics driver 'dvipdfmx' to support correct scaling \
in vertical direction of Japanese pTeX/upTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn63967"

RPM_NAME = "texlive-pxtatescale-2023.209.0.0.4svn63967-54.1.noarch.rpm"
RPM_HASH = "7018f62088d2225048d9b12c06d9522008d3a5bb096412440f998b0f1b7a9be2d8a680a07cd9a232238058d4d3872e9da9641c23d5454af7be3c720cf34dcb24"
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
