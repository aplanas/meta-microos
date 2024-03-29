SUMMARY = "Qt 6 base unstable ABI meta package"
DESCRIPTION = "This meta-package requires all the qt6-base development packages that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-base-private-devel-6.5.2-2.1.noarch.rpm"
RPM_HASH = "b4cef6faa09f0e16410216e1e80895206a09e5f18bb7d71e6cc09466d07e80422f14bf770aa417f31ed15a3852a48fa1cb639f4b814542068362e0b0ab90d8b2"
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
