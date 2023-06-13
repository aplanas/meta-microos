SUMMARY = "Development files for the GEGL 'Generic Graphics Library'"
DESCRIPTION = "GEGL provides infratructure to do demand based cached non destructive \
image editing on larger than RAM buffers. Through babl, it provides \
support for a wide range of color models and pixel storage formats for \
input and output."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.4.44"

RPM_NAME = "gegl-devel-0.4.44-1.2.aarch64.rpm"
RPM_HASH = "04417d89e672a7f6d3ff9febdea405683507be97f2fc65976b742af28f5ef158610faadc44dc93d83803e3e6290f2091293890303f47ab0e16ec0c0ffcd4a71f"

RPROVIDES:${PN} += "gegl-devel \
gegl-devel(aarch-64) \
pkgconfig(gegl-0.4) \
pkgconfig(gegl-sc-0.4)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgegl-0_4-0 \
pkgconfig(babl-0.1) \
pkgconfig(gegl-0.4) \
pkgconfig(gio-2.0) \
pkgconfig(gio-unix-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gmodule-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(json-glib-1.0) \
typelib-1_0-Gegl-0_4"

inherit rpm
