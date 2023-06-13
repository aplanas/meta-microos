SUMMARY = "System library of the MATE Document Viewer"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and \
singlepage document formats like PDF and PostScript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "libatrildocument3-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "616d2066f3166c0882793b4aec11f9561ff43e158f868cd44278296df2091ae588db807021915ad685ad6f37cab29768ec5848380df578ff0d08ba0394eb573a"

RPROVIDES:${PN} += "libatrildocument.so.3()(64bit) \
libatrildocument3 \
libatrildocument3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libsynctex.so.2()(64bit)"

inherit rpm
