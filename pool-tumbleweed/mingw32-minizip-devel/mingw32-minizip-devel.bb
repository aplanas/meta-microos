SUMMARY = "Development files for the minizip library"
DESCRIPTION = "This package contains the libraries and header files needed for \
developing applications which use minizip."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "mingw32-minizip-devel-1.2.13-3.2.noarch.rpm"
RPM_HASH = "59c5fd7a4f93b58872a05743c480ea77da957a185d7d8b338818852a6da559e5b230e5645eb283f3cdccbb325e8586d96e7bfc4cd495ae0ad29b02205e31d9cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-lib-minizip \
mingw32-minizip-devel \
mingw32-pkg-minizip"

RDEPENDS:${PN} += "mingw32-libminizip1"

inherit rpm
