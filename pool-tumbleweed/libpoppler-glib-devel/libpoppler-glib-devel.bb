SUMMARY = "Development files for the Poppler Glib wrapper library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.05.0"

RPM_NAME = "libpoppler-glib-devel-23.05.0-1.1.aarch64.rpm"
RPM_HASH = "9ac0e4556ef30440c85e6758c42770dcb6bec17182d399b5fdbc1e0bd782807a575cd2d0f295a0eb3a8208b631a9cc24838022c6e3750b517a04b350d8e572e2"

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
