SUMMARY = "MinGW Windows compiler for C shared libraries"
DESCRIPTION = "MinGW Windows compiler for C shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-libgomp1-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "0771f45eee51e85a87f4a89eef5a4ab88e9f2fe3ca338c55bdfa457632db97e2d3d44bf3cad73f45a2e1b17865e7921cdb9e9442bed956a7e5106e48dff83cd3"

RPROVIDES:${PN} += "mingw32-libgomp \
mingw32-libgomp-1.dll \
mingw32-libgomp1"

RDEPENDS:${PN} += "mingw32-libgcc-s-sjlj-1.dll \
mingw32-libwinpthread-1.dll"

inherit rpm
