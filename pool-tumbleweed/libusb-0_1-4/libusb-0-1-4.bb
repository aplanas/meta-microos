SUMMARY = "libusb-1.0 Compatibility Library for libusb-0.1"
DESCRIPTION = "A compatibility layer allowing applications written for libusb-0.1 to \
work with libusb-1.0. libusb-compat-0.1 attempts to look, feel, smell \
and walk like libusb-0.1."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "0.1.13"

RPM_NAME = "libusb-0_1-4-0.1.13-38.2.aarch64.rpm"
RPM_HASH = "39f5bc14df68c1731ff88d74d946137d37784b6acb34e70d0c12fb444862fccae0667e7dc35cb249e43310fead947d8263d48673d6c043d70e723f3d308d9e86"

RPROVIDES:${PN} += "libusb \
libusb-0-1-4 \
libusb-0.1.so.4 \
libusb-1-0-features-in-0-1-api"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
