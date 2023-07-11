SUMMARY = "Shared library for umockdev-preload"
DESCRIPTION = "umockdev mocks Linux devices for creating integration tests for hardware \
related libraries and programs. \
 \
This package provides the shared library for umockdev-preload."
LICENSE = "LGPL-2.1-or-later"

PV = "0.17.17"

RPM_NAME = "libumockdev-preload0-0.17.17-1.2.aarch64.rpm"
RPM_HASH = "7b4097784474ae48de1885af405da5ab620894174267f53ac5f6453bde54c0c38c39bf66d371f60029e20693dfb1720e28595137b16a62118431b6a77f45d3b7"

RPROVIDES:${PN} += "libumockdev-preload.so.0 \
libumockdev-preload0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
