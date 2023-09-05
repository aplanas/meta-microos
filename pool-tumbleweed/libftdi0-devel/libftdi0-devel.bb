SUMMARY = "Header files and static libraries for libftdi"
DESCRIPTION = "Header files and static libraries for libftdi. \
This library is used by many programs accessing FTDI USB-to-RS232 converters."
LICENSE = "LGPL-2.1+ & GPL-2.0-with-classpath-exception"

PV = "0.20"

RPM_NAME = "libftdi0-devel-0.20-1.11.aarch64.rpm"
RPM_HASH = "7066ff2946caf43cdb0c3f10a2195fa7d497384d17fbe887ad874a15c420edfd0d15a2a2a3e5f7ad8ccdb99bf7de34d91eece36552d8c7a367efc6c82c34476d"

RPROVIDES:${PN} += "libftdi0-devel \
pkgconfig-libftdi \
pkgconfig-libftdipp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libftdi1 \
libusb-compat-devel \
pkgconfig-libftdi"

inherit rpm
