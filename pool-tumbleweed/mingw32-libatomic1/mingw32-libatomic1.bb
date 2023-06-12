SUMMARY = "The GNU Compiler Atomic Operations Runtime Library"
DESCRIPTION = "The runtime library for atomic operations of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-libatomic1-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "b0d5bdb18ee2f3f9d9531062dfbebdbce46eb67d229359730dbf90dc74aa55d3e529affea4623e59782467f221ecf4cd1400846203fa1b58f1b667c51d181551"

RPROVIDES:${PN} += "mingw32(libatomic-1.dll) \
mingw32-libatomic1 \
mingw32-libatomic1(aarch-64)"
RDEPENDS:${PN} += "mingw32(libwinpthread-1.dll)"

inherit rpm
