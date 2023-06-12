SUMMARY = "Debug information for package mingw32-zlib"
DESCRIPTION = "This package provides debug information for package mingw32-zlib. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "mingw32-zlib-debug-1.2.13-3.1.noarch.rpm"
RPM_HASH = "01a260160d6aca766d532bca91246cd8410f4e4b55692e3cb8986af1155d3dd29606c4c3b6f14cdbdd76150ea0c5b05377e8e14903d727f0c8aaf55cb539e9e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-zlib-debug"
RDEPENDS:${PN} += ""

inherit rpm
