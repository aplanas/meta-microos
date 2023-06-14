SUMMARY = "A pthreads implementation for Windows"
DESCRIPTION = "mingw-w64's implementation of POSIX threads for Windows."
LICENSE = "BSD-3-Clause & MIT"

PV = "10.0.0"

RPM_NAME = "mingw32-libwinpthread1-10.0.0-1.6.noarch.rpm"
RPM_HASH = "ad6ea2830c715627398eecbc7dde4a89d482ab8eac6e24d8fc46b3f64eaaddef8539fa5a06a644d8550194f8b9ceea56b90706c543625dbae6cca1fe336308d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-libwinpthread-1.dll \
mingw32-libwinpthread1"

RDEPENDS:${PN} += ""

inherit rpm
