SUMMARY = "Debug information for package mingw32-gcc"
DESCRIPTION = "This package provides debug information for package mingw32-gcc. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-gcc-debug-12.2.0-3.1.noarch.rpm"
RPM_HASH = "dc40f4ac062bc83dd42844c831671ded1ae426c7a453a54f5d46641e3ec1c22cf79d5ced8550ee62bcdb4f7a83fd66da30da93179974e75a8d97ee6f4c879605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-gcc-debug"

RDEPENDS:${PN} += ""

inherit rpm
