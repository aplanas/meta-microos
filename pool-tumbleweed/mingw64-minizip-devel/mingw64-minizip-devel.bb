SUMMARY = "Development files for the minizip library"
DESCRIPTION = "This package contains the libraries and header files needed for \
developing applications which use minizip."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "mingw64-minizip-devel-1.2.13-2.1.noarch.rpm"
RPM_HASH = "9687f5554b781c1776b96f2404ab0b5f32f1518096700dc4eeefe715160124e4fee1b0e4623db782f6fecfbded34ffe8d7ba981964c20fd377f3d9aac67082ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-lib-minizip \
mingw64-minizip-devel \
mingw64-pkg-minizip"

RDEPENDS:${PN} += "mingw64-libminizip1"

inherit rpm
