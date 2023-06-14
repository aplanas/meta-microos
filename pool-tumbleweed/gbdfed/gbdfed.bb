SUMMARY = "A Gtk-based BDF Font Editor, Descendant of XmBDFed"
DESCRIPTION = "A Gtk-based bitmap font (BDF) editor, descendant of XmBDFed. It can \
import PK/GF fonts, HBF fonts (Han Bitmap Font),Linux console fonts \
(PSF, CP, FNT), Sun console fonts (vfont), Windows FON/FNT fonts, \
TrueType fonts and collections, and X server fonts. It exports PSF and \
HEX fonts and allows you to edit two- and four-bits-per-pixel grayscale \
fonts."
LICENSE = "BSD-3-Clause"

PV = "1.6"

RPM_NAME = "gbdfed-1.6-10.31.aarch64.rpm"
RPM_HASH = "0ed8038fb6070bc2467f44ee7325e76812578d6418634aa7958a19f299d31ca68da948e33035db51005315e95efb70901847ed4168590d763bfc051cb7040dbb"

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
