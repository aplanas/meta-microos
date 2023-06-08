SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "binutils-2.40-4.1.aarch64.rpm"
RPM_HASH = "d8dd677ea8b9200e8fe735478bcae74df6c0beb4c62aafc8ba5ba799d82437620d62ab8648c53a604d389067c159aa24e7420c4824dc7d2bd4e40577b11e1909"

RPROVIDES:${PN} += "binutils binutils(aarch-64) libbfd-2.40.0.20230412-4.so()(64bit) libdep.so()(64bit) libgprofng.so.0()(64bit) libopcodes-2.40.0.20230412-4.so()(64bit) libsframe.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig /usr/bin/env ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libctf-nobfd.so.0()(64bit) libctf-nobfd.so.0(LIBCTF_1.0)(64bit) libctf-nobfd.so.0(LIBCTF_1.1)(64bit) libctf.so.0()(64bit) libctf.so.0(LIBCTF_1.0)(64bit) libctf.so.0(LIBCTF_1.1)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
