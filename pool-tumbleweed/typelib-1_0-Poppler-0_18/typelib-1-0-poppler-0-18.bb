SUMMARY = "Introspection bindings for the Poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC. \
 \
This package provides the GObject Introspection bindings for Poppler."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.06.0"

RPM_NAME = "typelib-1_0-Poppler-0_18-23.06.0-1.1.aarch64.rpm"
RPM_HASH = "458133147b663eddbfa12ed112df62aea1a4db1037012cc720f20be813b379e9f6ee243ebd017fd94dd76368640d59445573d52058fcf6ee66576e10a0e76736"

RPROVIDES:${PN} += "typelib-1-0-Poppler-0-18 \
typelib-Poppler"

RDEPENDS:${PN} += "libpoppler-glib.so.8 \
libpoppler.so.129 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-cairo"

inherit rpm
