SUMMARY = "Shared library for umockdev"
DESCRIPTION = "umockdev mocks Linux devices for creating integration tests for hardware \
related libraries and programs. \
 \
This package provides the shared library for umockdev."
LICENSE = "LGPL-2.1-or-later"

PV = "0.17.17"

RPM_NAME = "libumockdev0-0.17.17-1.1.aarch64.rpm"
RPM_HASH = "7af79f1043a3b011d79a836735821445a8d24bad89c33fef20d70e25b7b298c4320603b79bc6f52840d557440e338fe8b8fb1cf8d957ea7cd853341b1e69eb1a"

RPROVIDES:${PN} += "libumockdev.so.0()(64bit) \
libumockdev0 \
libumockdev0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpcap.so.1()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
