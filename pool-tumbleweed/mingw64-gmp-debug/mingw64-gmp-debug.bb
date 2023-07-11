SUMMARY = "Debug information for package mingw64-gmp"
DESCRIPTION = "This package provides debug information for package mingw64-gmp. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "6.1.1"

RPM_NAME = "mingw64-gmp-debug-6.1.1-3.13.noarch.rpm"
RPM_HASH = "90a81d55c4d6527957fbfaa4646f910b1179166655d6caa186e9dcdd821c15f0db2688172fcdbac79f0e59fffa66c9928443122e33d21657a6e59435f4045fc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-gmp-debug"

RDEPENDS:${PN} += ""

inherit rpm
