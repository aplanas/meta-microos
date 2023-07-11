SUMMARY = "Development files for the minizip library"
DESCRIPTION = "This package contains the libraries and header files needed for \
developing applications which use minizip."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "mingw64-minizip-devel-1.2.13-2.2.noarch.rpm"
RPM_HASH = "d951c1943b2a3cc6f94e4b9a97dd15816ec469d31c0f65c16a7fa4cd634e07178eb2fd4490e1019f4c05a5fc651611c0cfd0e566766686a2585e5111cbc203a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-lib-minizip \
mingw64-minizip-devel \
mingw64-pkg-minizip"

RDEPENDS:${PN} += "mingw64-libminizip1"

inherit rpm
