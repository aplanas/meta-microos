SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-ppc64-binutils-2.40-4.1.aarch64.rpm"
RPM_HASH = "43eb884d422a2156fb278250c9a533f2b62d3be8bbf5a8b968a33762c060c168c8cd82b8aaae0a709c9c84b1363c4570db8d5ef1400f297ae9d23c51d58cddbb"

RPROVIDES:${PN} += "cross-ppc64-binutils cross-ppc64-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
