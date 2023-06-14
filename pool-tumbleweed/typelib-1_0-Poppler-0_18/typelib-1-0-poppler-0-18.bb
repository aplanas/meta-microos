SUMMARY = "Introspection bindings for the Poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC. \
 \
This package provides the GObject Introspection bindings for Poppler."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.05.0"

RPM_NAME = "typelib-1_0-Poppler-0_18-23.05.0-1.1.aarch64.rpm"
RPM_HASH = "3b5b24aa0353dd86a3e60ae48767d444e91856e06c09a0658d3563135ecd3f97862dfba55dd805d207ff246a14db8b3568366c74a8f1e416febea02bbcc14931"

RPROVIDES:${PN} += "typelib-1-0-Poppler-0-18 \
typelib-Poppler"

RDEPENDS:${PN} += "libpoppler-glib.so.8 \
libpoppler.so.128 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-cairo"

inherit rpm
