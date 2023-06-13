SUMMARY = "Development files for aravis"
DESCRIPTION = "This package contains the development files for aravis"
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.26"

RPM_NAME = "libaravis-0_8-devel-0.8.26-1.1.aarch64.rpm"
RPM_HASH = "9931069518c60aa29a51d177725478cba2cbeffbcd2ccb8b6b806c93704e01fdf162299dee34be5c1de1ca94a0794b96fe59cd1c31cd24cc087eadb5c1e41461"

RPROVIDES:${PN} += "libaravis-0_8-devel \
libaravis-0_8-devel(aarch-64) \
pkgconfig(aravis-0.8)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaravis-0_8-0 \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(libusb-1.0) \
pkgconfig(libxml-2.0) \
pkgconfig(zlib)"

inherit rpm
