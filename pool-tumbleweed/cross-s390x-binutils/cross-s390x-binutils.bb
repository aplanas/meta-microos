SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-s390x-binutils-2.40-5.1.aarch64.rpm"
RPM_HASH = "04456273f5771015a59b0a7790c461702e36332afac9fbc78419863ed5c5ae8fa9d1e11be35eb6325638231197f4cfb2b3b6957d752102cb44e89db55ac8e314"

RPROVIDES:${PN} += "cross-s390x-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1 \
update-alternatives"

inherit rpm
