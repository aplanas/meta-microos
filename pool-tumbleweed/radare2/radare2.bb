SUMMARY = "Reverse Engineering Framework"
DESCRIPTION = "Opensource tools to disassemble, debug, analyze and manipulate binary files."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "5.8.6"

RPM_NAME = "radare2-5.8.6-1.2.aarch64.rpm"
RPM_HASH = "9caeb4828cae8dc712ab9452b1767a4e2afb9597a0490bdedf66f85c018db9c37acd048a98b7f5347d39517bbb8bc12ef7bb100056ad62268e506110cdab4c50"

RPROVIDES:${PN} += "libr-anal.so.5.8.6 \
libr-arch.so.5.8.6 \
libr-asm.so.5.8.6 \
libr-bin.so.5.8.6 \
libr-bp.so.5.8.6 \
libr-config.so.5.8.6 \
libr-cons.so.5.8.6 \
libr-core.so.5.8.6 \
libr-crypto.so.5.8.6 \
libr-debug.so.5.8.6 \
libr-egg.so.5.8.6 \
libr-esil.so.5.8.6 \
libr-flag.so.5.8.6 \
libr-fs.so.5.8.6 \
libr-io.so.5.8.6 \
libr-lang.so.5.8.6 \
libr-magic.so.5.8.6 \
libr-main.so.5.8.6 \
libr-reg.so.5.8.6 \
libr-search.so.5.8.6 \
libr-socket.so.5.8.6 \
libr-syscall.so.5.8.6 \
libr-util.so.5.8.6 \
radare2"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcapstone.so.4 \
libm.so.6 \
libmagic.so.1 \
libxxhash.so.0 \
libz.so.1 \
libzip.so.5"

inherit rpm
