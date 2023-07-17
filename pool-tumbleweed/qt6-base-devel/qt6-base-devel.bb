SUMMARY = "Qt 6 base development meta package"
DESCRIPTION = "This meta-package requires all the qt6-base development packages."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-base-devel-6.5.1-4.1.noarch.rpm"
RPM_HASH = "da7226a6151e92c7b9c55199d3d7995f30442c2cfbce61bad31ac0d63e09803b1f18dba55672dc7dd9a427b176c9b4f686fc6d441dc0439c6912405eeafcecf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-base-devel"

RDEPENDS:${PN} += "cmake-Qt6Concurrent \
cmake-Qt6Core \
cmake-Qt6DBus \
cmake-Qt6Gui \
cmake-Qt6Network \
cmake-Qt6OpenGL \
cmake-Qt6OpenGLWidgets \
cmake-Qt6PrintSupport \
cmake-Qt6Sql \
cmake-Qt6Test \
cmake-Qt6Widgets \
cmake-Qt6Xml \
qt6-base-common-devel"

inherit rpm
