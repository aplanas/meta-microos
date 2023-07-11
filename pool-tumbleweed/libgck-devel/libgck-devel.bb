SUMMARY = "Development files for gck, a GObject library to access PKCS#11 modules"
DESCRIPTION = "GCK is a library for accessing PKCS#11 modules like smart cards, in a \
(G)object oriented way."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "libgck-devel-4.1.0-1.2.aarch64.rpm"
RPM_HASH = "03a68dab27ddfe627e9aa8f1f7dd51bc953c980878ab57e15d184678b54a2ba6b61394ff8ae2b96f0fbdbfb3764c346db0b9b4bc7b032b6fd593ae92e658ed21"

RPROVIDES:${PN} += "libgck-devel \
pkgconfig-gck-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgck-2-2 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-p11-kit-1 \
typelib-1-0-Gck-2"

inherit rpm
