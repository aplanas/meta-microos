SUMMARY = "A collection of utilities and DSOs to handle compiled objects"
DESCRIPTION = "libasm contains the 'asm' and 'disasm' functions to assemble and \
disassamble instructions. (There is only partial support for i686 and \
BPF instructions.) This is part of the elfutils package."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libasm1-0.189-5.1.aarch64.rpm"
RPM_HASH = "dcccdf8b975e96cf1c7e706e8411a14f34094c5f6290d32b64d6b6d9e8083d95fa6fbb77b2a6bc30d0213c4e125e60391df909baea054b688353e4ce63e52bda"

RPROVIDES:${PN} += "libasm.so.1 \
libasm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1"

inherit rpm
