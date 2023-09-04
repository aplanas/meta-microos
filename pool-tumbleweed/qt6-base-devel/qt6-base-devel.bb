SUMMARY = "Qt 6 base development meta package"
DESCRIPTION = "This meta-package requires all the qt6-base development packages."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-base-devel-6.5.2-2.1.noarch.rpm"
RPM_HASH = "cb6bf453b25b7428913d8b67c4a90954381399b91099da1eaf20a077010b0977b86591d685c4befffd6abaa80f2ae99694de2b9ad5c2280453baf535a17be319"
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
