SUMMARY = "The GNU Compiler Atomic Operations Runtime Library"
DESCRIPTION = "The runtime library for atomic operations of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-libatomic1-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "17bffdffb30b9d569ec89a300336e66abd99366d2ecb5fa7a08a8bdce49c52fb29d0f0553abdb577651c42bf54e654ec84376eddb8336a941b15c782e4baeb23"

RPROVIDES:${PN} += "mingw64-libatomic-1.dll \
mingw64-libatomic1"

RDEPENDS:${PN} += "mingw64-libwinpthread-1.dll"

inherit rpm
