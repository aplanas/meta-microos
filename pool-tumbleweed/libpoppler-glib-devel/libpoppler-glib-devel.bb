SUMMARY = "Development files for the Poppler Glib wrapper library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.06.0"

RPM_NAME = "libpoppler-glib-devel-23.06.0-1.1.aarch64.rpm"
RPM_HASH = "861fb5698a4e61f3133db37311426436fe09c447b871a8bb8cabb297dc792c77536f7291c94ced1bb8ee4248c6a98db7784d71c31e9e356e3fdc72fc2214d222"

RPROVIDES:${PN} += "libpoppler-glib-devel \
pkgconfig-poppler-glib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpoppler-glib8 \
pkgconfig-cairo \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-poppler \
typelib-1-0-Poppler-0-18"

inherit rpm
