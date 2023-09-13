SUMMARY = "Library to access DWARF debugging information"
DESCRIPTION = "This package provides a high-level library to access the DWARF debugging \
information. This is part of the elfutils package."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdw1-0.189-5.1.aarch64.rpm"
RPM_HASH = "4e2664b3cd6dc63ccd9ce96b19c647ba7d2a1ddf79297716d4d66631842ab4a87cfc5d405fb306920e4af0f5b79638fffa74c87a8ab346baf83ef25016b17cd5"

RPROVIDES:${PN} += "libdw.so.1 \
libdw1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libelf.so.1 \
liblzma.so.5 \
libz.so.1 \
libzstd.so.1"

inherit rpm
