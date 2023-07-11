SUMMARY = "The GNU Compiler Atomic Operations Runtime Library"
DESCRIPTION = "The runtime library for atomic operations of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-libatomic1-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "a1ffbf3698f60675a6fe1637273a6d200076c4311ba6dcef7a07f7e44151711ce357c14870896c8f8ee01315f5b0c63bcbe2e8bc444a104318c532f09c44562d"

RPROVIDES:${PN} += "mingw32-libatomic-1.dll \
mingw32-libatomic1"

RDEPENDS:${PN} += "mingw32-libwinpthread-1.dll"

inherit rpm
