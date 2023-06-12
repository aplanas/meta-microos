SUMMARY = "Development files for the minizip library"
DESCRIPTION = "This package contains the libraries and header files needed for \
developing applications which use minizip."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "mingw32-minizip-devel-1.2.13-3.1.noarch.rpm"
RPM_HASH = "d85280384a6bf16fe6aefc2d5c962112c17ae5127597fb5a4de4561983afc9143b09322c54dbfd622e9fed867e1d60edeed77d4e1489b1739452944f4e72861a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32(lib:minizip) \
mingw32(pkg:minizip) \
mingw32-minizip-devel"
RDEPENDS:${PN} += "mingw32-libminizip1"

inherit rpm
