SUMMARY = "Patch to graphics driver for scaling in vertical direction of pTeX"
DESCRIPTION = "Patch for graphics driver 'dvipdfmx' to support correct scaling \
in vertical direction of Japanese pTeX/upTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn63967"

RPM_NAME = "texlive-pxtatescale-2023.201.0.0.4svn63967-53.1.noarch.rpm"
RPM_HASH = "a88ef83e71471caad7532ef31ae0e9bfc34bdaa7dacbdd6bde19ef46e89b88c4dffa2d17b2d0c3013842afee98e3a06bf584eb6686ba486963736c451b1df07e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pxtatescale.sty) \
texlive-pxtatescale"

RDEPENDS:${PN} += "/bin/sh \
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
