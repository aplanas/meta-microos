SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "binutils-2.40-5.1.aarch64.rpm"
RPM_HASH = "e587cbe1a624647daf95fcdf4e6e86a7bdb314ad4083e62f123008dc59b6dfd2bbad6f479698fa6ad1e4cec2252f027688d294841bb847dc3d77637b48dfdf48"

RPROVIDES:${PN} += "binutils \
libbfd-2.40.0.20230412-5.so \
libdep.so \
libgprofng.so.0 \
libopcodes-2.40.0.20230412-5.so \
libsframe.so.0"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
/usr/bin/env \
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
