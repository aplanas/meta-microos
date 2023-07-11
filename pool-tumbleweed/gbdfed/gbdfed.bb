SUMMARY = "A Gtk-based BDF Font Editor, Descendant of XmBDFed"
DESCRIPTION = "A Gtk-based bitmap font (BDF) editor, descendant of XmBDFed. It can \
import PK/GF fonts, HBF fonts (Han Bitmap Font),Linux console fonts \
(PSF, CP, FNT), Sun console fonts (vfont), Windows FON/FNT fonts, \
TrueType fonts and collections, and X server fonts. It exports PSF and \
HEX fonts and allows you to edit two- and four-bits-per-pixel grayscale \
fonts."
LICENSE = "BSD-3-Clause"

PV = "1.6"

RPM_NAME = "gbdfed-1.6-10.32.aarch64.rpm"
RPM_HASH = "3d3be16bf337e6196c6dc4f4157c23607a22954ea742f86e217908ca0d04d984313a10c0deb9f9486385b9d1a4a4eda20753320076bbae20760cb4087a26367d"

RPROVIDES:${PN} += "gbdfed"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libfreetype.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0"

inherit rpm
