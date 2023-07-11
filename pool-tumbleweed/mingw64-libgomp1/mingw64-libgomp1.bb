SUMMARY = "MinGW Windows compiler for C shared libraries"
DESCRIPTION = "MinGW Windows compiler for C shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-libgomp1-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "3091d94cf8d70a408c6c03992c95f9331548143a89cb1f9e3444cb323c585d1b67502d999e21eda30a03a030f276cda03438dbf2d4b137c940dd3539eae58e0e"

RPROVIDES:${PN} += "mingw64-libgomp \
mingw64-libgomp-1.dll \
mingw64-libgomp1"

RDEPENDS:${PN} += "mingw64-libgcc-s-seh-1.dll \
mingw64-libwinpthread-1.dll"

inherit rpm
