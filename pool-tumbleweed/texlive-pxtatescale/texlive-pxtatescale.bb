SUMMARY = "Patch to graphics driver for scaling in vertical direction of pTeX"
DESCRIPTION = "Patch for graphics driver 'dvipdfmx' to support correct scaling \
in vertical direction of Japanese pTeX/upTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn63967"

RPM_NAME = "texlive-pxtatescale-2023.201.0.0.4svn63967-53.2.noarch.rpm"
RPM_HASH = "921d6f8349daaaf908fec2c194c3402e49785d61f3e17ac53242322f910fb9df6d0c96d26e74c42a419606ab8fdc80a64a26967ec37fd37424a319d75561de6d"
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
