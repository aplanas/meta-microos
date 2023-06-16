SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-arm-binutils-2.40-5.1.aarch64.rpm"
RPM_HASH = "bc03e30ee3dda54a211b831740c11df68cd991454b737af2db4f3229569fe6301d79eaf747b9395bd2740ee8d96ddd9aeb2970767fb2739020280ceb9eccd63f"

RPROVIDES:${PN} += "cross-arm-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1 \
update-alternatives"

inherit rpm
