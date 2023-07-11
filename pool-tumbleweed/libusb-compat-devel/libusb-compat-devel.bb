SUMMARY = "libusb-1.0 Compatibility Layer for libusb-0.1"
DESCRIPTION = "A compatibility layer allowing applications written for libusb-0.1 to \
work with libusb-1.0. libusb-compat-0.1 attempts to look, feel, smell \
and walk like libusb-0.1."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "0.1.8"

RPM_NAME = "libusb-compat-devel-0.1.8-38.2.aarch64.rpm"
RPM_HASH = "e00cfbab2b73f1a89727a9b9be0050c2471e93c0b0895951f44293e96b287240595c41e6630ac7a28a6984f725c762f9e2610e616cccc0fc0862f8c886f0476d"

RPROVIDES:${PN} += "libusb-compat-devel \
libusb-devel \
pkgconfig-libusb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libusb-0-1-4 \
libusb-1-0-devel \
libusb-1-0-features-in-0-1-api \
pkgconfig-libusb-1.0"

inherit rpm
