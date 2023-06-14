SUMMARY = "Development files for gsound"
DESCRIPTION = "GSound is a library for playing system sounds. \
It's designed to be used via GObject Introspection, \
and is a wrapper around the libcanberra C library. \
 \
This package provides files needed for developing \
applications with gsound."
LICENSE = "LGPL-2.1-only"

PV = "1.0.3"

RPM_NAME = "gsound-devel-1.0.3-2.8.aarch64.rpm"
RPM_HASH = "0d8600c08da7cee3aeb3f2b4c500baecdee40702411c0a43a47ca5deeb25b8b4f473309ce7767d8772b3ae65f0a423de63913f44880cbfcaa8466f3ca8f075a6"

RPROVIDES:${PN} += "gsound-devel \
pkgconfig-gsound"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgsound0 \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libcanberra \
typelib-1-0-GSound-1-0"

inherit rpm
