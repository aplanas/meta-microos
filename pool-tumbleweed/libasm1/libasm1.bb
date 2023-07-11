SUMMARY = "A collection of utilities and DSOs to handle compiled objects"
DESCRIPTION = "libasm contains the 'asm' and 'disasm' functions to assemble and \
disassamble instructions. (There is only partial support for i686 and \
BPF instructions.) This is part of the elfutils package."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libasm1-0.189-3.3.aarch64.rpm"
RPM_HASH = "acd2d3b4f91b80d541baff06683498a266f8a13a118ea6dfc84b1eec27785c4ce1ab06fefc4c7ef83ad1c811525b26402f4046a16b04e3b2ff40a409698720ff"

RPROVIDES:${PN} += "libasm.so.1 \
libasm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1"

inherit rpm
