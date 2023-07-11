SUMMARY = "Higher-level library to access ELF files"
DESCRIPTION = "elfutils is a collection of utilities and libraries to read, create \
and modify ELF binary files, find and handle DWARF debug data, \
symbols, thread state and stacktraces for processes and core files."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "elfutils-0.189-3.3.aarch64.rpm"
RPM_HASH = "04f85a6a4d7214d8cb396e856e392af1799f7361def1ce9617186b5e69449f21b7a99b2bdf38dbb75f0bd85f3c41735c0aa6d1073374cab299abd9acc3642940"

RPROVIDES:${PN} += "elfutils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasm.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
libstdc++.so.6"

inherit rpm
