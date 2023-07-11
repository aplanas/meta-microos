SUMMARY = "Shared library for umockdev"
DESCRIPTION = "umockdev mocks Linux devices for creating integration tests for hardware \
related libraries and programs. \
 \
This package provides the shared library for umockdev."
LICENSE = "LGPL-2.1-or-later"

PV = "0.17.17"

RPM_NAME = "libumockdev0-0.17.17-1.2.aarch64.rpm"
RPM_HASH = "93df88b077c677ec1cf58458b034598db2457258c9e2441b4445e61665b1f5adeb11bc226035e84e7ef541ac5dfbc21321b8fc6800082e52642daffc936d781c"

RPROVIDES:${PN} += "libumockdev.so.0 \
libumockdev0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpcap.so.1 \
libudev.so.1"

inherit rpm
