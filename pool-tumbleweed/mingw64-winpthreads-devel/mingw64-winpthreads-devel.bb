SUMMARY = "Development files for mingw64-winpthreads"
DESCRIPTION = "mingw-w64's implementation of POSIX threads for Windows."
LICENSE = "BSD-3-Clause & MIT"

PV = "10.0.0"

RPM_NAME = "mingw64-winpthreads-devel-10.0.0-1.8.noarch.rpm"
RPM_HASH = "5f342c72440d02ad8b6ad17fead69b4a2308bec6eac928e72129688c1946814d788e7ea9fe39db8951905bd8c3d226b31a6cc7021036f66281fbc8452805ca78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-lib-pthread \
mingw64-lib-winpthread \
mingw64-unistd-pthread-devel \
mingw64-winpthreads-devel"

RDEPENDS:${PN} += "mingw64-libwinpthread1"

inherit rpm
