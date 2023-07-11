SUMMARY = "Headers and sources for developing apps with umockdev"
DESCRIPTION = "umockdev mocks Linux devices for creating integration tests for hardware \
related libraries and programs. \
 \
This package provides the headers and sources needed to build software against \
umockdev."
LICENSE = "LGPL-2.1-or-later"

PV = "0.17.17"

RPM_NAME = "umockdev-devel-0.17.17-1.2.aarch64.rpm"
RPM_HASH = "8caa599c2151c2ae0ffddac36607db61770bfbe221afd0d9ae8f89087bd4219dcf0a472fed1561a067b2df340e457d1810b0d8a69635e86d1a6527ba86847363"

RPROVIDES:${PN} += "pkgconfig-umockdev-1.0 \
umockdev-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libumockdev-preload0 \
libumockdev0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
typelib-1-0-UMockdev-1-0 \
umockdev"

inherit rpm
