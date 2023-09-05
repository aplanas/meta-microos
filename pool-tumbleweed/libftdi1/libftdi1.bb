SUMMARY = "Library to program and control the FTDI USB controller"
DESCRIPTION = "Library to program and control the FTDI USB controller. \
This library is used by many programs accessing FTDI USB-to-RS232 converters."
LICENSE = "LGPL-2.1+ & GPL-2.0-with-classpath-exception"

PV = "0.20"

RPM_NAME = "libftdi1-0.20-1.11.aarch64.rpm"
RPM_HASH = "d716355a84956a73a91c748143db6699959ebb3f22fdc30b8c64440c8b25f4b0bf2db8a1a86552002310ae06dbd433eb49369d6e7189411c49ea22d430090104"

RPROVIDES:${PN} += "libftdi.so.1 \
libftdi1 \
libftdipp.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusb-0.1.so.4"

inherit rpm
