SUMMARY = "Qt 6 3D unstable ABI meta package"
DESCRIPTION = "This meta-package requires all the qt6-3d development packages that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3d-private-devel-6.5.2-1.1.noarch.rpm"
RPM_HASH = "5970f1fc5cd68d4071f7fc3fc7281b64453b7b4ffcc0b414d16dca04c36f571891ca843cfa4ab4520c5abf7d8812bb00a14cba3749c8ca92b2fd51b867b2c385"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-3d-private-devel"

RDEPENDS:${PN} += "qt6-3d-devel \
qt6-3danimation-private-devel \
qt6-3dcore-private-devel \
qt6-3dextras-private-devel \
qt6-3dinput-private-devel \
qt6-3dlogic-private-devel \
qt6-3dquick-private-devel \
qt6-3dquickanimation-private-devel \
qt6-3dquickextras-private-devel \
qt6-3dquickinput-private-devel \
qt6-3dquickrender-private-devel \
qt6-3dquickscene2d-private-devel \
qt6-3drender-private-devel"

inherit rpm
