SUMMARY = "Qt 6 base development meta package"
DESCRIPTION = "This meta-package requires all the qt6-base development packages."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-base-devel-6.5.2-1.1.noarch.rpm"
RPM_HASH = "fba0209dddc5701c4a1457e88c39df3a70e25a2e19c56d91afb2fba3a7e9feaca13f4c1b349dc40bbc2005ce93214efc69107d111848f90e4a6b99e72fd2d69d"
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
