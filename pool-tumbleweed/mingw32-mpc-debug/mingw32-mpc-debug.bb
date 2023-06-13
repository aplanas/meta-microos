SUMMARY = "Debug information for package mingw32-mpc"
DESCRIPTION = "This package provides debug information for package mingw32-mpc. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.2"

RPM_NAME = "mingw32-mpc-debug-1.0.2-3.1.noarch.rpm"
RPM_HASH = "09adf6a67eb2b859bc9529d7fc462fc260a637f0efd9f77872bea5f25643aefb906e7ab96ac0ad7879745b82ad9661416bc43674dfc017bc245a960097032861"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-mpc-debug"

RDEPENDS:${PN} += ""

inherit rpm
