SUMMARY = "Define SVG named colours"
DESCRIPTION = "The package defines the W3C Scalable Vector Graphics (SVG) \
colour names for use with both the color and PSTricks packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-svgcolor-2023.201.1.0svn15878-57.1.noarch.rpm"
RPM_HASH = "261b5970bbc3af14162489cf66aada8661eed7736cffd64f784ad8f4f8304c03964cf2d95b67a573fb90c82903c1e95dbb94d1b0a0e86b419481cb44d53011bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(svgcolor.sty) \
texlive-svgcolor"

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
