SUMMARY = "Qt 6 3D development meta package"
DESCRIPTION = "This meta-package requires all the qt6-3d development packages."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3d-devel-6.5.1-1.1.noarch.rpm"
RPM_HASH = "f797c1edae6ced964d5f8b57ad8e2bc3b0efe464daab1d55ae8d14e2cef02460211842b97e03bdd0997e9ab48e3f6b672071c68aa72599e360e9df0a2acbb42e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-3d-devel"

RDEPENDS:${PN} += "cmake(Qt63DAnimation) \
cmake(Qt63DCore) \
cmake(Qt63DExtras) \
cmake(Qt63DInput) \
cmake(Qt63DLogic) \
cmake(Qt63DQuick) \
cmake(Qt63DQuickAnimation) \
cmake(Qt63DQuickExtras) \
cmake(Qt63DQuickInput) \
cmake(Qt63DQuickRender) \
cmake(Qt63DQuickScene2D) \
cmake(Qt63DRender)"

inherit rpm
