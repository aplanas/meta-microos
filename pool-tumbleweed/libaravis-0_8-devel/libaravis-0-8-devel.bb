SUMMARY = "Development files for aravis"
DESCRIPTION = "This package contains the development files for aravis"
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.26"

RPM_NAME = "libaravis-0_8-devel-0.8.26-1.2.aarch64.rpm"
RPM_HASH = "4508c2726fc7c37655f933b8c38dcc0cc563849ef28d3ba149d3029a9a1cdd1fc3a87301119dc2ede617fe55d1431f91ad92cf2e4fbeca91f9b2419f0b20a3d5"

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
