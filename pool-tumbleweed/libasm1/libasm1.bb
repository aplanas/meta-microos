SUMMARY = "A collection of utilities and DSOs to handle compiled objects"
DESCRIPTION = "libasm contains the 'asm' and 'disasm' functions to assemble and \
disassamble instructions. (There is only partial support for i686 and \
BPF instructions.) This is part of the elfutils package."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libasm1-0.189-4.1.aarch64.rpm"
RPM_HASH = "4a54aff6bdcaaecb996593fe48e17794fac14d1aec671895365e70ceda10d9775d511070ded5a40ffdeb3c57e1ea14685f563bb6a55ef97f189f4f8a0a882b11"

RPROVIDES:${PN} += "libasm.so.1 \
libasm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1"

inherit rpm
