SUMMARY = "Higher-level library to access ELF files"
DESCRIPTION = "elfutils is a collection of utilities and libraries to read, create \
and modify ELF binary files, find and handle DWARF debug data, \
symbols, thread state and stacktraces for processes and core files."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "elfutils-0.189-5.1.aarch64.rpm"
RPM_HASH = "d2c83e2a870d5e579c666fd5e3b2753cc1a450ac38329d7719f7118da84c79579bdd512b77552164264a48217fe436088ff9e4362b1cde6c98d06d0407e2c513"

RPROVIDES:${PN} += "elfutils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasm.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
libstdc++.so.6"

inherit rpm
