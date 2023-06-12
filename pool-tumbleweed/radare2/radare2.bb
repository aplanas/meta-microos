SUMMARY = "Reverse Engineering Framework"
DESCRIPTION = "Opensource tools to disassemble, debug, analyze and manipulate binary files."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "5.8.6"

RPM_NAME = "radare2-5.8.6-1.1.aarch64.rpm"
RPM_HASH = "d90ecdf9da1d07a90169108c24e15f6af38a51ed349566f603ed0c2d80059752ce262cfde7803975118514a64035d61cff64fd07214f0f14bfd7ff242f45a1fc"

RPROVIDES:${PN} += "libr_anal.so.5.8.6()(64bit) \
libr_arch.so.5.8.6()(64bit) \
libr_asm.so.5.8.6()(64bit) \
libr_bin.so.5.8.6()(64bit) \
libr_bp.so.5.8.6()(64bit) \
libr_config.so.5.8.6()(64bit) \
libr_cons.so.5.8.6()(64bit) \
libr_core.so.5.8.6()(64bit) \
libr_crypto.so.5.8.6()(64bit) \
libr_debug.so.5.8.6()(64bit) \
libr_egg.so.5.8.6()(64bit) \
libr_esil.so.5.8.6()(64bit) \
libr_flag.so.5.8.6()(64bit) \
libr_fs.so.5.8.6()(64bit) \
libr_io.so.5.8.6()(64bit) \
libr_lang.so.5.8.6()(64bit) \
libr_magic.so.5.8.6()(64bit) \
libr_main.so.5.8.6()(64bit) \
libr_reg.so.5.8.6()(64bit) \
libr_search.so.5.8.6()(64bit) \
libr_socket.so.5.8.6()(64bit) \
libr_syscall.so.5.8.6()(64bit) \
libr_util.so.5.8.6()(64bit) \
radare2 \
radare2(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libcapstone.so.4()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libmagic.so.1()(64bit) \
libxxhash.so.0()(64bit) \
libz.so.1()(64bit) \
libzip.so.5()(64bit)"

inherit rpm
