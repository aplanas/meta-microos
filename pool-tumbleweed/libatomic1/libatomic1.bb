SUMMARY = "The GNU Compiler Atomic Operations Runtime Library"
DESCRIPTION = "The runtime library for atomic operations of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.2.1+git7683"

RPM_NAME = "libatomic1-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "03b6abee27110c7f4873e2790f85371409891386330897101ee3711e4c719684375ed0c7f4505ea75dff39d678d66c7d4fd2aff6712a4dc4515bfee903ef1938"

RPROVIDES:${PN} += "libatomic.so.1 \
libatomic1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
