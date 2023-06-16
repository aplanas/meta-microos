SUMMARY = "Userspace daemon for using joy-cons with the hid-nintendo kernel driver"
DESCRIPTION = "joycond is a Linux daemon which uses evdev devices provided by \
hid-nintendo (formerly known as hid-joycon) to implement joycond \
pairing."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.0+git.51~f9a6691"

RPM_NAME = "joycond-0.1.0+git.51~f9a6691-3.6.aarch64.rpm"
RPM_HASH = "a5806a76c54a6c771d88bb19e35ad224a0deb3fad3c25167c695248a7155c42fc27ba6d6178d46683d2357c6d71d5a42bf960d5fb55e34b9625fe831fc5b185f"

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
