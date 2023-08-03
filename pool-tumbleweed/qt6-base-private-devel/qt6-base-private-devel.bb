SUMMARY = "Qt 6 base unstable ABI meta package"
DESCRIPTION = "This meta-package requires all the qt6-base development packages that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-base-private-devel-6.5.2-1.1.noarch.rpm"
RPM_HASH = "0138a65f86d7cccd248d20f1d6260748476768cf7dae916bae5b127e2eb9cf5457ce7200c7b5eb15169ea2e80008069571605c0d1cee82252d8a18527817d061"
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
