SUMMARY = "C library for encoding data in a QR Code symbol - Development files"
DESCRIPTION = "Libqrencode is a C library for encoding data in a QR Code symbol, a kind of 2D \
symbology that can be scanned by handy terminals such as a mobile phone with \
CCD. The capacity of QR Code is up to 7000 digits or 4000 characters, and is \
highly robust. \
 \
This package contains the development files for libqrencode."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.1"

RPM_NAME = "qrencode-devel-4.1.1-1.11.aarch64.rpm"
RPM_HASH = "00b19287f49c6e3c7aeb4a6b2fa614f87aa7d5604561f3b692af56d237b484643ce88ebdf2cf0d4c85c1d7f86abb078e9cf5dbed6a4fcaa6cb63c5680f2dc3ce"

RPROVIDES:${PN} += "pkgconfig-libqrencode \
qrencode-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqrencode4"

inherit rpm
