SUMMARY = "Debug information for package mingw32-mpfr"
DESCRIPTION = "This package provides debug information for package mingw32-mpfr. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.2"

RPM_NAME = "mingw32-mpfr-debug-3.1.2-2.12.noarch.rpm"
RPM_HASH = "e5fb12ecea323385fc60f04e81923efb228c26707f960cd179219981a6b2ef85e6382d430f92c8836f34761bc14964fd5202de4078f755cb1186a72bb109a530"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-mpfr-debug"

RDEPENDS:${PN} += ""

inherit rpm
