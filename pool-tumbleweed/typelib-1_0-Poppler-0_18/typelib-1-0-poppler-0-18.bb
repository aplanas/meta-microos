SUMMARY = "Introspection bindings for the Poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC. \
 \
This package provides the GObject Introspection bindings for Poppler."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.07.0"

RPM_NAME = "typelib-1_0-Poppler-0_18-23.07.0-1.1.aarch64.rpm"
RPM_HASH = "cfb7bd7c05e94b74e1e13b3b8c5e1e543af325b62219f9bd89765453b86cff17949d4bbf4715f592cf5a30615b91799faf8e652baf75b7d503b136161137a83d"

RPROVIDES:${PN} += "typelib-1-0-Poppler-0-18 \
typelib-Poppler"

RDEPENDS:${PN} += "libpoppler-glib.so.8 \
libpoppler.so.130 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-cairo"

inherit rpm
