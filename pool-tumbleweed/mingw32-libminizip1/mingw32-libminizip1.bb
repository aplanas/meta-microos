SUMMARY = "Zip archive library"
DESCRIPTION = "Minizip is a library for manipulation with files from .zip archives."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "mingw32-libminizip1-1.2.13-3.2.noarch.rpm"
RPM_HASH = "fff22aedcf3342b906caad336e2ed6fc4fdf87f4330780cf1957fe6c136f1668e76d6a6c87975941f13e07714660e87cc703e28488c0cc7254ae6d80196f76df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-libminizip-1.dll \
mingw32-libminizip1 \
mingw32-minizip"

RDEPENDS:${PN} += "mingw32-libz.dll"

inherit rpm
