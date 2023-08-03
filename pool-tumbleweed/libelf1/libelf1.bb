SUMMARY = "Library to read and write ELF files"
DESCRIPTION = "This package provides a high-level library to read and write ELF files. \
This is part of the elfutils package."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libelf1-0.189-4.1.aarch64.rpm"
RPM_HASH = "2ceb48edfcf9c307016b6cd705bd650d86e46234d4d1e3998ad97367f23ca51e06c0dfaa9ec4a489bcc93c09e375834a56c43b8a40f2804279a83530dd3e86fb"

RPROVIDES:${PN} += "libelf.so.1 \
libelf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
