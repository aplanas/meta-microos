SUMMARY = "General-Purpose Utility Library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.4"

RPM_NAME = "glib2-doc-2.76.4-1.1.aarch64.rpm"
RPM_HASH = "f7779c09689046288da41b414c40fa1e5665046b7002d11dad1a4df437fa387c42d326f8c5a194cda105c014d8cc17f3ece993a323d8583322ea05c771fda406"

RPROVIDES:${PN} += "glib2-devel-/usr/share/gtk-doc/html/gobject/index.html \
glib2-doc"

RDEPENDS:${PN} += ""

inherit rpm
