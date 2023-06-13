SUMMARY = "A collection of utilities and DSOs to handle compiled objects"
DESCRIPTION = "libasm contains the 'asm' and 'disasm' functions to assemble and \
disassamble instructions. (There is only partial support for i686 and \
BPF instructions.) This is part of the elfutils package."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libasm1-0.189-3.1.aarch64.rpm"
RPM_HASH = "c79637ee7c1f36b77fa58e2c8a0c5c3855e9dfebe617a52923553f9467cff323b57c6a28e5d0aa87d2b5001279e04efb74ad4dde1936054abdd671f38603209f"

RPROVIDES:${PN} += "libasm.so.1()(64bit) \
libasm.so.1(ELFUTILS_1.0)(64bit) \
libasm1 \
libasm1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdw.so.1()(64bit) \
libdw.so.1(ELFUTILS_0.167)(64bit) \
libelf.so.1()(64bit) \
libelf.so.1(ELFUTILS_1.0)(64bit) \
libelf.so.1(ELFUTILS_1.4)(64bit)"

inherit rpm
