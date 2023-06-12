SUMMARY = "Automatic computation of bounding boxes with PiCTeX"
DESCRIPTION = "This package makes PiCTeX recognize lines and arcs in \
determining the 'bounding box' of a picture. (PiCTeX so far \
accounted for put commands only). The 'bounding box' is \
essential for proper placement of a picture between running \
text and margins and for keeping the running text away."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3asvn59552"

RPM_NAME = "texlive-autoarea-2023.201.0.0.3asvn59552-53.1.noarch.rpm"
RPM_HASH = "6e2d721a72be4d149994619fdb8c2e72821db2bba4c6849c45b72e594b9d97b9eef86f2829ae70abcc62ce99e518291abe3d05fa99d57a0bb71d87f7933211d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(autoarea.sty) \
texlive-autoarea"
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
