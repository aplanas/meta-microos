SUMMARY = "A Diagram Creation Program"
DESCRIPTION = "Dia is designed to be much like the commercial program 'Visio.' It can \
be used to draw many different kinds of diagrams. It has special \
objects to help draw entity relationship diagrams, UML diagrams, SADT, \
flowcharts, network diagrams, and simple circuits. It is possible to \
add support for new shapes by writing simple XML files, and using a \
subset of SVG to draw the shape. \
 \
Dia can load and save diagrams to a custom XML format (gzipped by \
default to save space), can export diagrams to EPS, PNG, CGM, or SVG \
formats, and can print diagrams (including ones that span multiple \
pages)."
LICENSE = "GPL-2.0-or-later"

PV = "0.97.3"

RPM_NAME = "dia-0.97.3-11.12.aarch64.rpm"
RPM_HASH = "a9944943048601b134aa1d2981fd857da3f428c55c7862d4ba6dffe08ab0ba9b7312736497fc823cdc13fd0c5e304607ea6efa036d64f284bc4c0a6c44c8fab2"

RPROVIDES:${PN} += "dia \
libaadl-objects.so \
libart-filter.so \
libcairo-filter.so \
libcgm-filter.so \
libchronogram-objects.so \
libcustom-lines-objects.so \
libcustom-objects.so \
libdb-objects.so \
libdia.so \
libdxf-filter.so \
liber-objects.so \
libflowchart-objects.so \
libfs-objects.so \
libgrafcet-objects.so \
libhpgl-filter.so \
libistar-objects.so \
libjackson-objects.so \
libkaos-objects.so \
libmetapost-filter.so \
libmisc-objects.so \
libnetwork-objects.so \
libpgf-filter.so \
libpixbuf-filter.so \
libpostscript-filter.so \
libpstricks-filter.so \
libsadt-objects.so \
libshape-filter.so \
libstandard-objects.so \
libsvg-filter.so \
libuml-objects.so \
libvdx-filter.so \
libwmf-filter.so \
libwpg-filter.so \
libxfig-filter.so \
libxslt-filter.so"

RDEPENDS:${PN} += "ghostscript-fonts-std \
ld-linux-aarch64.so.1 \
libEMF.so.1 \
libart-lgpl-2.so.2 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgthread-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpng16.so.16 \
libxml2.so.2 \
libxslt.so.1 \
libz.so.1 \
xdg-utils"

inherit rpm
