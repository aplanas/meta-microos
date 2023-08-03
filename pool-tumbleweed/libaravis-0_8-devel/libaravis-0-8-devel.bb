SUMMARY = "Development files for aravis"
DESCRIPTION = "This package contains the development files for aravis"
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.27"

RPM_NAME = "libaravis-0_8-devel-0.8.27-1.1.aarch64.rpm"
RPM_HASH = "01f9954beb180a2e0cfbaab498de41384c5f25ed5ccd214f3bbea2125a428f014cd3d3712da0d4bf5a6a734b9c9aa8a3ac25cba81d40fa7587fe122c69014726"

RPROVIDES:${PN} += "libaravis-0-8-devel \
pkgconfig-aravis-0.8"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaravis-0-8-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libusb-1.0 \
pkgconfig-libxml-2.0 \
pkgconfig-zlib"

inherit rpm
