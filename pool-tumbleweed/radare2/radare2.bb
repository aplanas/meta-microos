SUMMARY = "Reverse Engineering Framework"
DESCRIPTION = "Opensource tools to disassemble, debug, analyze and manipulate binary files."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "5.8.6"

RPM_NAME = "radare2-5.8.6-1.1.aarch64.rpm"
RPM_HASH = "d90ecdf9da1d07a90169108c24e15f6af38a51ed349566f603ed0c2d80059752ce262cfde7803975118514a64035d61cff64fd07214f0f14bfd7ff242f45a1fc"

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
