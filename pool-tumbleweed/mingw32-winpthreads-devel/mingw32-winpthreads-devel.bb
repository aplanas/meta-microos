SUMMARY = "Development files for mingw32-winpthreads"
DESCRIPTION = "mingw-w64's implementation of POSIX threads for Windows."
LICENSE = "BSD-3-Clause & MIT"

PV = "10.0.0"

RPM_NAME = "mingw32-winpthreads-devel-10.0.0-1.8.noarch.rpm"
RPM_HASH = "70189f1712a991c7cd56e38c14f191d9f2d0ea4d7496a2a44cdf6361025b2cd6360bae1426f5abb826082fede0514bdefbf15f97f19c1d8078b4b7e2adc02153"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-lib-pthread \
mingw32-lib-winpthread \
mingw32-unistd-pthread-devel \
mingw32-winpthreads-devel"

RDEPENDS:${PN} += "mingw32-libwinpthread1"

inherit rpm
