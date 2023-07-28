SUMMARY = "Development files for the Poppler Glib wrapper library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.07.0"

RPM_NAME = "libpoppler-glib-devel-23.07.0-1.1.aarch64.rpm"
RPM_HASH = "71812b412d6eb6923cbd7cf8e1a52a4b3489afe747d5af2fa822e8016b8c8f0b51b894198c3ae37be575090892ef19258f97805880bab7049f72b9116da66b8f"

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
