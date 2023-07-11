SUMMARY = "Debug information for package mingw32-winpthreads"
DESCRIPTION = "This package provides debug information for package mingw32-winpthreads. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "BSD-3-Clause & MIT"

PV = "10.0.0"

RPM_NAME = "mingw32-winpthreads-debug-10.0.0-1.8.noarch.rpm"
RPM_HASH = "0e1cd49662b8ce4356c9bdd190a0390e5b776f06b4cfdf2e722c893288116e78325b204371d12a170e1de69b24da1347d3ec0a35895bfb698747b8a99f89bee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-winpthreads-debug"

RDEPENDS:${PN} += ""

inherit rpm
