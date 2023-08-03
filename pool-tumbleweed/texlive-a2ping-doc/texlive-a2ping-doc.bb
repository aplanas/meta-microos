SUMMARY = "Documentation for texlive-a2ping"
DESCRIPTION = "This package includes the documentation for texlive-a2ping"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.84psvn52964"

RPM_NAME = "texlive-a2ping-doc-2023.209.2.84psvn52964-55.1.noarch.rpm"
RPM_HASH = "389ea01f5984d23a06c68f474eba228783feee3db586281d1e44fa22deb5be357d8267bb499ad125167b44908df03e968750c78d4d4367e771acbc8c6705336a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-a2ping.1 \
texlive-a2ping-doc"

RDEPENDS:${PN} += ""

inherit rpm
