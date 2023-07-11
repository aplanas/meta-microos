SUMMARY = "Zip archive library"
DESCRIPTION = "Minizip is a library for manipulation with files from .zip archives."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "mingw64-libminizip1-1.2.13-2.2.noarch.rpm"
RPM_HASH = "b31dab2af761af766000fff2c4be1ce6cbb02d85c4fc2177315e0366e60991a1bc79d9c82465b8b99a26b2ca73d11f328c7331a97952e4cc8052ff931a883655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-libminizip-1.dll \
mingw64-libminizip1 \
mingw64-minizip"

RDEPENDS:${PN} += "mingw64-libz.dll"

inherit rpm
