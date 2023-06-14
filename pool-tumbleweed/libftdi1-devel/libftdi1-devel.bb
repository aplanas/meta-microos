SUMMARY = "Header files for libftdi1"
DESCRIPTION = "Header files and static libraries for libftdi. \
This library is used by many programs accessing FTDI USB-to-RS232 converters."
LICENSE = "LGPL-2.1-only & GPL-2.0-only & GPL-2.0-with-classpath-exception"

PV = "1.5.12+git.0684c1b"

RPM_NAME = "libftdi1-devel-1.5.12+git.0684c1b-2.1.aarch64.rpm"
RPM_HASH = "60ef0313157bb4d6bd1381d8d5648ef97b369b15eb8df6769bc6db4871424f62ff8c461fdbd02a3dd5fa65ac97f9a970fce12a891abb28e2baf92812e71dfabc"

RPROVIDES:${PN} += "cmake-LibFTDI1 \
libftdi1-devel \
pkgconfig-libftdi1 \
pkgconfig-libftdipp1"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libconfuse.so.2 \
libftdi1-2 \
libftdi1.so.2 \
libusb-1.0.so.0 \
pkgconfig-libftdi1 \
pkgconfig-libusb-1.0"

inherit rpm
