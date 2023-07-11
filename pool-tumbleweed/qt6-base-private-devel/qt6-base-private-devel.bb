SUMMARY = "Qt 6 base unstable ABI meta package"
DESCRIPTION = "This meta-package requires all the qt6-base development packages that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-base-private-devel-6.5.1-3.1.noarch.rpm"
RPM_HASH = "21af7092c4624360bbfff0220f66202a859fa3e3eed7a6623243af64ae5ea95b57753e568fc5a3029ef5b5fb2a502b3d0c187c6c84d0408f200ca0e02e6249a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-base-private-devel"

RDEPENDS:${PN} += "qt6-base-devel \
qt6-core-private-devel \
qt6-dbus-private-devel \
qt6-gui-private-devel \
qt6-kmssupport-private-devel \
qt6-network-private-devel \
qt6-opengl-private-devel \
qt6-platformsupport-private-devel \
qt6-printsupport-private-devel \
qt6-sql-private-devel \
qt6-test-private-devel \
qt6-widgets-private-devel \
qt6-xml-private-devel"

inherit rpm
