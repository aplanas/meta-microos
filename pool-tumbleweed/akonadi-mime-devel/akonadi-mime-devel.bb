SUMMARY = "MIME email parser for KDE PIM - development files"
DESCRIPTION = "This package contains development headers needed to use MIME message parsing \
in KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "akonadi-mime-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "352cd52840b60eee9d5bf518e4ada060333a1e73fa4b6a67d27511bb749c6559f64a0280c9bc9c8be37f9d93489a876a3744d1b71e71055f3fa47db13b3bf93e"

RPROVIDES:${PN} += "akonadi-mime-devel \
cmake-KF5AkonadiMime \
cmake-KPim5AkonadiMime"

RDEPENDS:${PN} += "cmake-KPim5Akonadi \
libKPim5AkonadiMime5"

inherit rpm
