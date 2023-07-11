SUMMARY = "Header files for libftdi1"
DESCRIPTION = "Header files and static libraries for libftdi. \
This library is used by many programs accessing FTDI USB-to-RS232 converters."
LICENSE = "LGPL-2.1-only & GPL-2.0-only & GPL-2.0-with-classpath-exception"

PV = "1.5.12+git.0684c1b"

RPM_NAME = "libftdi1-devel-1.5.12+git.0684c1b-2.2.aarch64.rpm"
RPM_HASH = "767b6167e2a894266a6d9a8fd3acb84d78779df159949ea2d94f7663ca2be9d5021e7be59f77bc3df8309f470c86fe2e4a44caa319f0bdbede974b8f7621450d"

RPROVIDES:${PN} += "cmake-LibFTDI1 \
libftdi1-devel \
pkgconfig-libftdi1 \
pkgconfig-libftdipp1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libconfuse.so.2 \
libftdi1-2 \
libftdi1.so.2 \
libusb-1.0.so.0 \
pkgconfig-libftdi1 \
pkgconfig-libusb-1.0"

inherit rpm
