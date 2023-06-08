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

RPROVIDES:${PN} += "application() application(gbdfed.desktop) gbdfed gbdfed(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreetype.so.6()(64bit) libgdk-x11-2.0.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libpango-1.0.so.0()(64bit)"

inherit rpm
