SUMMARY = "Library to read and write ELF files"
DESCRIPTION = "This package provides a high-level library to read and write ELF files. \
This is part of the elfutils package."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libelf1-0.189-5.1.aarch64.rpm"
RPM_HASH = "17b2446f7c5553d1636856db3a3edf0b6c4156c259ac0715950dc04c4c82ea85206aaa2c31d0a50d70e682c4a229013f7cd54f8bd3d227eb2c331730b0d08934"

RPROVIDES:${PN} += "libelf.so.1 \
libelf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
