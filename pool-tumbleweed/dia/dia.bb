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

RPM_NAME = "dia-0.97.3-11.11.aarch64.rpm"
RPM_HASH = "d547b4b3d57a253b410ca964c3424d9454520bf5aabb805843f479913074dd7e8c93534894a12dadbd14d4d467dc3b7c61dcc33763ac85c4d1766663d1527136"

RPROVIDES:${PN} += "application() \
application(dia.desktop) \
dia \
dia(aarch-64) \
libaadl_objects.so()(64bit) \
libart_filter.so()(64bit) \
libcairo_filter.so()(64bit) \
libcgm_filter.so()(64bit) \
libchronogram_objects.so()(64bit) \
libcustom_lines_objects.so()(64bit) \
libcustom_objects.so()(64bit) \
libdb_objects.so()(64bit) \
libdia.so()(64bit) \
libdxf_filter.so()(64bit) \
liber_objects.so()(64bit) \
libflowchart_objects.so()(64bit) \
libfs_objects.so()(64bit) \
libgrafcet_objects.so()(64bit) \
libhpgl_filter.so()(64bit) \
libistar_objects.so()(64bit) \
libjackson_objects.so()(64bit) \
libkaos_objects.so()(64bit) \
libmetapost_filter.so()(64bit) \
libmisc_objects.so()(64bit) \
libnetwork_objects.so()(64bit) \
libpgf_filter.so()(64bit) \
libpixbuf_filter.so()(64bit) \
libpostscript_filter.so()(64bit) \
libpstricks_filter.so()(64bit) \
libsadt_objects.so()(64bit) \
libshape_filter.so()(64bit) \
libstandard_objects.so()(64bit) \
libsvg_filter.so()(64bit) \
libuml_objects.so()(64bit) \
libvdx_filter.so()(64bit) \
libwmf_filter.so()(64bit) \
libwpg_filter.so()(64bit) \
libxfig_filter.so()(64bit) \
libxslt_filter.so()(64bit) \
metainfo() \
metainfo(dia.appdata.xml) \
mimehandler(application/x-dia-diagram)"

RDEPENDS:${PN} += "ghostscript-fonts-std \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libEMF.so.1()(64bit) \
libart_lgpl_2.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libfreetype.so.6()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgthread-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpangoft2-1.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxslt.so.1()(64bit) \
libxslt.so.1(LIBXML2_1.0.11)(64bit) \
libz.so.1()(64bit) \
xdg-utils"

inherit rpm
