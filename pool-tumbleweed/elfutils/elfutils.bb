SUMMARY = "Higher-level library to access ELF files"
DESCRIPTION = "elfutils is a collection of utilities and libraries to read, create \
and modify ELF binary files, find and handle DWARF debug data, \
symbols, thread state and stacktraces for processes and core files."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "elfutils-0.189-4.1.aarch64.rpm"
RPM_HASH = "59b2947dc14fb403fd469de6ebfe794ff45249a3389dab66473b1fcc378f9dcd2031d7a58bfde1736f887b1066c0df865cb416440fbd2fe770c944f4f29e3c33"

RPROVIDES:${PN} += "elfutils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasm.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
libstdc++.so.6"

inherit rpm
