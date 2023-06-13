SUMMARY = "Debug information for package mingw32-binutils"
DESCRIPTION = "This package provides debug information for package mingw32-binutils. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.39"

RPM_NAME = "mingw32-binutils-debug-2.39-4.3.noarch.rpm"
RPM_HASH = "db83f42b22b07d722063dbcec73b88e12d5bfe815d3c3c54ee10b5720d8dc9588a512907289265c03de7e15c0ca2d1705aa0a2489ada1ee22f6a845ab396966f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-binutils-debug"

RDEPENDS:${PN} += ""

inherit rpm
