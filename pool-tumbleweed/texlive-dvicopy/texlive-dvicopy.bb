SUMMARY = "Copy DVI files, flattening VFs"
DESCRIPTION = "DVICOPY is a utility program that allows one to take a DVI file \
that references composite fonts (VF) and convert it into a DVI \
file that does not contain such references. It also serves as a \
basis for writing DVI drivers (much like DVItype)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.5svn66186"

RPM_NAME = "texlive-dvicopy-2023.209.1.5svn66186-54.2.noarch.rpm"
RPM_HASH = "b0a231dce654943cbdc23b3962a8cb559708c4a75d69e01d3fc487118ddaa46f744d12df50d8dc991e0cdfdce5c45ac974d10ffea0b17d463102660c8e1777e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvicopy.1 \
texlive-dvicopy"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dvicopy-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
