SUMMARY = "Debug information for package mingw64-pkgconf"
DESCRIPTION = "This package provides debug information for package mingw64-pkgconf. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "ISC"

PV = "1.6.3"

RPM_NAME = "mingw64-pkgconf-debug-1.6.3-5.1.noarch.rpm"
RPM_HASH = "908d53b4fad38c65cbf6d0f3f006ed2b36e055418217b0d574e5f8581397cc206c2e21038091468356297781d004bcd5a5b87a03772fa2c92c7245a092517eef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-pkgconf-debug"

RDEPENDS:${PN} += ""

inherit rpm
