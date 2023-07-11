SUMMARY = "Development files for the Osmocom USB library"
DESCRIPTION = "The libosmosub library in particular contains routines for USB device \
access via libusb-1.0, integrated into the libosmocore select event loop. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmousb."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmousb-devel-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "96ae49ec3cdcd2b5bf478f9000ec7a94aeaeef93df2da70e6f85d1890821a2de1c362965e7adb4fd9d3590c86d52f86d6d6f0d36bd9e2924cb0c6ca67bfa3f0f"

RPROVIDES:${PN} += "libosmousb-devel \
pkgconfig-libosmousb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmocore-devel \
libosmousb0 \
libusb-1-0-devel \
pkgconfig-libosmocore \
pkgconfig-libusb-1.0 \
pkgconfig-talloc"

inherit rpm
