SUMMARY = "Qt 6 3D unstable ABI meta package"
DESCRIPTION = "This meta-package requires all the qt6-3d development packages that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3d-private-devel-6.5.1-2.1.noarch.rpm"
RPM_HASH = "09aa0bdab0319546663674b1b2240c21e5a2cd51af7a655dd591aa2e92e9a52a7b16e6815b626d58c17f573f6a2b0d845d82650dff0b91391f65bd92a8e1c6fc"
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
