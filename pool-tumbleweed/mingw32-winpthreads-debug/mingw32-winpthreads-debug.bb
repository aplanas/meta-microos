SUMMARY = "Debug information for package mingw32-winpthreads"
DESCRIPTION = "This package provides debug information for package mingw32-winpthreads. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "BSD-3-Clause & MIT"

PV = "10.0.0"

RPM_NAME = "mingw32-winpthreads-debug-10.0.0-1.6.noarch.rpm"
RPM_HASH = "4d129d51ec3fd7098d8eebb5b7c79e8b67ec93534648c9242f29b71e7a5d87e86d847831fbf94e509b4af968921218eeba33a4054b0a9ffcc2dab66273b293bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-winpthreads-debug"

RDEPENDS:${PN} += ""

inherit rpm
