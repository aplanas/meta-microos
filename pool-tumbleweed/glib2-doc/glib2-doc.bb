SUMMARY = "General-Purpose Utility Library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.3"

RPM_NAME = "glib2-doc-2.76.3-1.1.aarch64.rpm"
RPM_HASH = "2847683dfdc7117a7b12dec176faf402ba1423c25fd4e82ff504bffd6ff493cb23c3d547b6806eb2fb5667f64919b2bf0fc5474364fa07b8dafd858bc8a270ab"

RPROVIDES:${PN} += "glib2-devel:/usr/share/gtk-doc/html/gobject/index.html \
glib2-doc \
glib2-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
