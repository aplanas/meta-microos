SUMMARY = "C/C++ library for processing large images"
DESCRIPTION = "VIPS is an image processing system. It is good with large images \
(images larger than the amount of RAM you have available), with many CPUs, \
for working with colour, for scientific analysis and for general \
research and development."
LICENSE = "LGPL-2.1-only"

PV = "8.13.3"

RPM_NAME = "typelib-1_0-Vips-8_13-8.13.3-1.5.aarch64.rpm"
RPM_HASH = "33aca524f5f1ef73d17934920486fb71237fe5cd59b519497fcfd4afec2540b3c4ac34c734f0c758549b238f731a1445216ce2c298b687ee387846d928bc4581"

RPROVIDES:${PN} += "typelib(Vips) \
typelib-1_0-Vips-8_13 \
typelib-1_0-Vips-8_13(aarch-64)"

RDEPENDS:${PN} += "libvips.so.42()(64bit) \
typelib(GLib) \
typelib(GObject)"

inherit rpm
