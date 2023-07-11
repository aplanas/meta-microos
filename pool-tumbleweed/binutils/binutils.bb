SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "binutils-2.40-5.3.aarch64.rpm"
RPM_HASH = "fb4be2ca546f18a8d8c00ee280488621f59d7865aed18a524d5d34dc2b046563511aa083854b183bc9e2b7328c862972a1e044d9ed3e0769a9e7ea22d15a7896"

RPROVIDES:${PN} += "binutils \
libbfd-2.40.0.20230412-5.so \
libdep.so \
libgprofng.so.0 \
libopcodes-2.40.0.20230412-5.so \
libsframe.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libctf-nobfd.so.0 \
libctf.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1 \
update-alternatives"

inherit rpm
