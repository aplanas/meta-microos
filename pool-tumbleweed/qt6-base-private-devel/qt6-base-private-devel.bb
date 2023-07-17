SUMMARY = "Qt 6 base unstable ABI meta package"
DESCRIPTION = "This meta-package requires all the qt6-base development packages that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-base-private-devel-6.5.1-4.1.noarch.rpm"
RPM_HASH = "db0d9ca031a42bbb76f5ac8d597278a06ff68aec567476ee08d432f3bc96e66b9cb43feaa4c83d9936c249563d71ed77a58a1d778cab33907ad5fe9ce1517f03"
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
