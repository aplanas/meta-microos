SUMMARY = "Library to access DWARF debugging information"
DESCRIPTION = "This package provides a high-level library to access the DWARF debugging \
information. This is part of the elfutils package."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdw1-0.189-4.1.aarch64.rpm"
RPM_HASH = "8ee3757c611b65e35a879a7b7a3377bb7b74479d5d4a7ebed317360782be2a7a3b9686d5bf41ee67b7140772ec4a7ae5e49fbc0764abbf07f3828808bcd9a59a"

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
