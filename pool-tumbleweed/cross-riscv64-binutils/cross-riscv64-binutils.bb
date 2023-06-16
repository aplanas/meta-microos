SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-riscv64-binutils-2.40-5.1.aarch64.rpm"
RPM_HASH = "ecc4d88c1aeb86eba0b18fe0d9c9e44eb7f33d0df2ce578d41d48e1232612ff259ea87c62ba552f75fa9bcaa71d4e5baf5510a860b1900c9e190e528b4baa5f9"

RPROVIDES:${PN} += "cross-riscv64-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1 \
update-alternatives"

inherit rpm
