SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-sparc64-binutils-2.40-4.1.aarch64.rpm"
RPM_HASH = "6062e773fea4fb9f3827295cb9d7a5703e3e89df3a1fd7eb2e4d335baf609c9e5989d502ff53b0d15202048f9f653d3407cd01f25be3ae982bd9e134dcb3c722"

RPROVIDES:${PN} += "cross-sparc64-binutils cross-sparc64-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
