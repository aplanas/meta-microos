SUMMARY = "libusb-1.0 Compatibility Layer for libusb-0.1"
DESCRIPTION = "A compatibility layer allowing applications written for libusb-0.1 to \
work with libusb-1.0. libusb-compat-0.1 attempts to look, feel, smell \
and walk like libusb-0.1."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "0.1.8"

RPM_NAME = "libusb-compat-devel-0.1.8-38.1.aarch64.rpm"
RPM_HASH = "ba323f7be0755a514e40a59ac0439e6e5a3490515e7cbc076241c347e5e2c8c2dde25d84450b49ebdc85b5ece6e8cff9bbfaaa967bd76c9705868724636de953"

RPROVIDES:${PN} += "libusb-compat-devel \
libusb-devel \
pkgconfig-libusb"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
glibc-devel \
libusb-0-1-4 \
libusb-1-0-devel \
libusb-1-0-features-in-0-1-api \
pkgconfig-libusb-1.0"

inherit rpm
