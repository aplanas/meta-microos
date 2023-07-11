SUMMARY = "Debug information for package mingw32-binutils"
DESCRIPTION = "This package provides debug information for package mingw32-binutils. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.39"

RPM_NAME = "mingw32-binutils-debug-2.39-4.5.noarch.rpm"
RPM_HASH = "7c1109455eb0e1c318b50c26b36e9d66434db3d783495d6c3818bfea366cb34ee84ab571fa5e9b32f9520d165a63c8787e3b64059ae8b75079c2cb313caded2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-binutils-debug"

RDEPENDS:${PN} += ""

inherit rpm
