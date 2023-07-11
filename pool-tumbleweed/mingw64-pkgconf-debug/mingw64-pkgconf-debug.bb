SUMMARY = "Debug information for package mingw64-pkgconf"
DESCRIPTION = "This package provides debug information for package mingw64-pkgconf. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "ISC"

PV = "1.6.3"

RPM_NAME = "mingw64-pkgconf-debug-1.6.3-5.3.noarch.rpm"
RPM_HASH = "cd1a7ccc8e795b733d3e6f71e6076e794cc1500a64e40180b23be3c1f345f99a44d3699bc011538d35f0491641309e93f70599dc422ee2dc023c67b31c538a59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-pkgconf-debug"

RDEPENDS:${PN} += ""

inherit rpm
