SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-ia64-binutils-2.40-5.1.aarch64.rpm"
RPM_HASH = "cdfda1731602c245f6310908f63d7f74fae49a5a27355352bd3421c1ab7d57bb85e94565d7c594b8eeecc3b2b484d7dfd47156eafc1a15dbb197892d99407fd5"

RPROVIDES:${PN} += "cross-ia64-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1 \
update-alternatives"

inherit rpm
