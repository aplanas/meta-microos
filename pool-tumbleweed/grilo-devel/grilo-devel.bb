SUMMARY = "Framework for browsing and searching media content -- Development Files"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.16"

RPM_NAME = "grilo-devel-0.3.16-1.1.aarch64.rpm"
RPM_HASH = "91857fe468dcb426450ade50b4aa7ff17d3d1001fa92c1fa60d129459a7dc8bcc0ddd71f140b5d348950a854f879a12779893c9e40d2bf039f305feb6f7f8b27"

RPROVIDES:${PN} += "grilo-devel \
pkgconfig-grilo-0.3 \
pkgconfig-grilo-net-0.3 \
pkgconfig-grilo-pls-0.3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgrilo-0-3-0 \
libgrlnet-0-3-0 \
libgrlpls-0-3-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-grilo-0.3 \
pkgconfig-libxml-2.0 \
typelib-1-0-Grl-0-3 \
typelib-1-0-GrlNet-0-3 \
typelib-1-0-GrlPls-0-3"

inherit rpm
