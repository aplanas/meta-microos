SUMMARY = "General-Purpose Utility Library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.5"

RPM_NAME = "glib2-doc-2.76.5-1.1.aarch64.rpm"
RPM_HASH = "dd1fb79fb57be5d7c313eb9fb7557ee75688acc2c290dcfd087f93db89c180a48e97850239420232da8f7bb3981c82d21f016f2d35c4077b450d77bc91a12314"

RPROVIDES:${PN} += "glib2-devel-/usr/share/gtk-doc/html/gobject/index.html \
glib2-doc"

RDEPENDS:${PN} += ""

inherit rpm
