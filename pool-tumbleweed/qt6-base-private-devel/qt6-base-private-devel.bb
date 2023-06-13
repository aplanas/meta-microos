SUMMARY = "Qt 6 base unstable ABI meta package"
DESCRIPTION = "This meta-package requires all the qt6-base development packages that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-base-private-devel-6.5.1-1.1.noarch.rpm"
RPM_HASH = "91c95b7be0e2ed1850568dedd53aa121f1840ecee07746fbab0be77898ad14d6e95e97478b2662e21ee825f087e444943e9af2e642e982ce8de4f02616a410e8"
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
