SUMMARY = "A pthreads implementation for Windows"
DESCRIPTION = "mingw-w64's implementation of POSIX threads for Windows."
LICENSE = "BSD-3-Clause & MIT"

PV = "10.0.0"

RPM_NAME = "mingw64-libwinpthread1-10.0.0-1.8.noarch.rpm"
RPM_HASH = "b676e199379dbf343feca56090586927b93aba0074f95351456360dd89f4b3c1bafba234b7d154be6f0e487b4ae1f9265ea1402b2cc1b717cfff520146ae07be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-libwinpthread-1.dll \
mingw64-libwinpthread1"

RDEPENDS:${PN} += ""

inherit rpm
