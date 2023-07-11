SUMMARY = "Library to read and write ELF files"
DESCRIPTION = "This package provides a high-level library to read and write ELF files. \
This is part of the elfutils package."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libelf1-0.189-3.3.aarch64.rpm"
RPM_HASH = "f8bc93e3d2eeaa70fac6583f20c308c48a5cf3705cb088101f8e0a0965ba7dcfa7a90f9340e5710a8c02f360a2f7ef746345bbc3a2b62a341ae9916e5f675bb7"

RPROVIDES:${PN} += "libelf.so.1 \
libelf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
