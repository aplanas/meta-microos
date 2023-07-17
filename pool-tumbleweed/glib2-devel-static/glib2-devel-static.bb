SUMMARY = "Static libraries for glib, a general-purpose utility library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
This package contains static versions of the GLib libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.4"

RPM_NAME = "glib2-devel-static-2.76.4-1.1.aarch64.rpm"
RPM_HASH = "423607931deb277ca921b9630e9bc975c4145bfc275ff7110ae9c827fe990fb761b67dd96764f178cb5d4a1a39e192e4483298cfe0f4a06c206258c92e1b4a47"

RPROVIDES:${PN} += "glib2-devel-static"

RDEPENDS:${PN} += "glib2-devel"

inherit rpm
