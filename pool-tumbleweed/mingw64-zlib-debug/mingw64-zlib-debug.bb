SUMMARY = "Debug information for package mingw64-zlib"
DESCRIPTION = "This package provides debug information for package mingw64-zlib. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "mingw64-zlib-debug-1.2.13-2.1.noarch.rpm"
RPM_HASH = "fb68604149def0565903edbbc613ac94f8f475a15595fb2b5c5000128fb87ddeb3b658e7fac9c71eae13c522b70869117b23b5967c9609cd12a01cb97a4c594f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-zlib-debug"
RDEPENDS:${PN} += ""

inherit rpm
