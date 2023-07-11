SUMMARY = "Debug information for package mingw64-zlib"
DESCRIPTION = "This package provides debug information for package mingw64-zlib. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "mingw64-zlib-debug-1.2.13-2.2.noarch.rpm"
RPM_HASH = "04bf1c4acf5b65874ec5a5e18a95281109b627ab8c448378e549884c6dae4b033ff186541ad7c17e2c1013fa24e5ce6deac04e085c8d7e251750f0c43958d467"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-zlib-debug"

RDEPENDS:${PN} += ""

inherit rpm
