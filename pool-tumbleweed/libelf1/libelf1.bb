SUMMARY = "Library to read and write ELF files"
DESCRIPTION = "This package provides a high-level library to read and write ELF files. \
This is part of the elfutils package."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libelf1-0.189-3.1.aarch64.rpm"
RPM_HASH = "d88e60badfc40a59796472ec8f27e421249ec761abc2b23250b84eea592e9ec7bf775a17224cae7af65e0a630c01764080f33b9a924a4422da360f752d2be2f7"

RPROVIDES:${PN} += "libelf.so.1 \
libelf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
