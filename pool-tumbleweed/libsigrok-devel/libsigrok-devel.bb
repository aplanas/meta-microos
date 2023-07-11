SUMMARY = "Development files for libsigrok, an API for talking to logic analyzer hardware"
DESCRIPTION = "libsigrok is a shared library written in C which provides the basic API \
for talking to logic analyzer hardware and reading/writing the acquired data \
into various input/output file formats. \
 \
This subpackage contains the headers to make use of the sigrok shared \
libraries."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "libsigrok-devel-0.5.2-4.13.aarch64.rpm"
RPM_HASH = "875799e4e1164821cd38b5b857f94a66999349d64b7f99cf9951c4bdf2c80395de9d9c4c4ce8a9ee419434188cbe7d87886b010721be366b0f245abbdcaf4ff0"

RPROVIDES:${PN} += "libsigrok-devel \
pkgconfig-libsigrok \
pkgconfig-libsigrokcxx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsigrok4 \
libsigrokcxx4 \
pkgconfig-bluez \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-glibmm-2.4 \
pkgconfig-hidapi-hidraw \
pkgconfig-libftdi1 \
pkgconfig-libserialport \
pkgconfig-libsigrok \
pkgconfig-libtirpc \
pkgconfig-libusb-1.0 \
pkgconfig-libzip"

inherit rpm
