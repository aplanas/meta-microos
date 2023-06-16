SUMMARY = "Higher-level library to access ELF files"
DESCRIPTION = "elfutils is a collection of utilities and libraries to read, create \
and modify ELF binary files, find and handle DWARF debug data, \
symbols, thread state and stacktraces for processes and core files."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "elfutils-0.189-3.1.aarch64.rpm"
RPM_HASH = "cc528036a532d4ad674a6865e37dac794d9b6796d786552bb8add23fc5e82913e37cad6acbf961d93c328b5ce3f30b2f6cd5af49656d40ecc65fb410cfd011b1"

RPROVIDES:${PN} += "elfutils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasm.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
libstdc++.so.6"

inherit rpm
