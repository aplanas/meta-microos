SUMMARY = "Headers and sources for developing apps with umockdev"
DESCRIPTION = "umockdev mocks Linux devices for creating integration tests for hardware \
related libraries and programs. \
 \
This package provides the headers and sources needed to build software against \
umockdev."
LICENSE = "LGPL-2.1-or-later"

PV = "0.17.17"

RPM_NAME = "umockdev-devel-0.17.17-1.1.aarch64.rpm"
RPM_HASH = "6eb6527c3f217b32ad433a2737343c48333ec4e8e8e31625af44cc73061b265f79a02293c09b006611726c29b2725e4a22abe70bbeb6b2caaa1e56a2d5ed0058"

RPROVIDES:${PN} += "pkgconfig(umockdev-1.0) \
umockdev-devel \
umockdev-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libumockdev-preload0 \
libumockdev0 \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
typelib-1_0-UMockdev-1_0 \
umockdev"

inherit rpm
