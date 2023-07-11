SUMMARY = "Development files for gsound"
DESCRIPTION = "GSound is a library for playing system sounds. \
It's designed to be used via GObject Introspection, \
and is a wrapper around the libcanberra C library. \
 \
This package provides files needed for developing \
applications with gsound."
LICENSE = "LGPL-2.1-only"

PV = "1.0.3"

RPM_NAME = "gsound-devel-1.0.3-2.9.aarch64.rpm"
RPM_HASH = "bc6cb8c36e16884b053ebde7ff52ef575f0f417387f3c91e2ee6e4c8d26b236737d57ee8fb83b3ac1cd885d6fae5313ed18af236ff1a09e515f2fd0eb068fcd1"

RPROVIDES:${PN} += "gsound-devel \
pkgconfig-gsound"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgsound0 \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libcanberra \
typelib-1-0-GSound-1-0"

inherit rpm
