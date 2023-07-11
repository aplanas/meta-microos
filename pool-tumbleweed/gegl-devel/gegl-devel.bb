SUMMARY = "Development files for the GEGL 'Generic Graphics Library'"
DESCRIPTION = "GEGL provides infratructure to do demand based cached non destructive \
image editing on larger than RAM buffers. Through babl, it provides \
support for a wide range of color models and pixel storage formats for \
input and output."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.4.46"

RPM_NAME = "gegl-devel-0.4.46-1.1.aarch64.rpm"
RPM_HASH = "38acd7efe76a07d1f59e604f005b8f04e33deed0eb820cddc3480cba5e70f0de3f46fbbfc499f4a6e6ee6c5d3ed20bee73641110c88eef7afd91cf0bbdb8d875"

RPROVIDES:${PN} += "gegl-devel \
pkgconfig-gegl-0.4 \
pkgconfig-gegl-sc-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgegl-0-4-0 \
pkgconfig-babl-0.1 \
pkgconfig-gegl-0.4 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-json-glib-1.0 \
typelib-1-0-Gegl-0-4"

inherit rpm
