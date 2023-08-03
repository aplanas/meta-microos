SUMMARY = "Automatic computation of bounding boxes with PiCTeX"
DESCRIPTION = "This package makes PiCTeX recognize lines and arcs in \
determining the 'bounding box' of a picture. (PiCTeX so far \
accounted for put commands only). The 'bounding box' is \
essential for proper placement of a picture between running \
text and margins and for keeping the running text away."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3asvn59552"

RPM_NAME = "texlive-autoarea-2023.209.0.0.3asvn59552-54.1.noarch.rpm"
RPM_HASH = "6c52f89236ff87c9b3197aa4f6440e085873465f4489c3a694600b882cb9142d11c4b37f9f7fd1b772d1cf332272c0b216d3d0377bc1b9aec0bde3ad2359ff56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autoarea.sty \
texlive-autoarea"

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
