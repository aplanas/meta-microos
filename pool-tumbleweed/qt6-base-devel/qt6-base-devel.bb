SUMMARY = "Qt 6 base development meta package"
DESCRIPTION = "This meta-package requires all the qt6-base development packages."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-base-devel-6.5.1-1.1.noarch.rpm"
RPM_HASH = "3e7d06941bcaed4fbfff080438ae2991ec14f732de77b3f5edbe4f9bf3a83f774965949be41bfe4d793532ec5e5f1c7d82ffdda5dbe4e78f0764243455b1ffea"
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
