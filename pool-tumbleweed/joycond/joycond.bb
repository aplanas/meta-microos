SUMMARY = "Userspace daemon for using joy-cons with the hid-nintendo kernel driver"
DESCRIPTION = "joycond is a Linux daemon which uses evdev devices provided by \
hid-nintendo (formerly known as hid-joycon) to implement joycond \
pairing."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.0+git.51~f9a6691"

RPM_NAME = "joycond-0.1.0+git.51~f9a6691-3.7.aarch64.rpm"
RPM_HASH = "b0a01537dcb4a5e991323cf309c77ea50df1c66f00e6c0234863bf00913267c56ec1917c9d897ae0ff9024d9ea581ac321fb81d841f6cdc4d16c05259721e45c"

RPROVIDES:${PN} += "joycond"

RDEPENDS:${PN} += "/usr/bin/sh \
kmod-hid-nintendo.ko \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libgcc-s.so.1 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
