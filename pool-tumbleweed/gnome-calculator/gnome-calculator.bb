SUMMARY = "A GNOME Calculator Application"
DESCRIPTION = "A GNOME calculator package based on calctool and MP library."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-calculator-44.0-1.2.aarch64.rpm"
RPM_HASH = "27612f90a43d670cf704441bbc80f875ee208fcc2984fcba985e2e440e385616f0bbe05ece0f75f2e11b2ebf01637048cbc0fe588a5fb1f8244883ed368ad8a0"

RPROVIDES:${PN} += "gnome-calculator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgtksourceview-5.so.0 \
libmpc.so.3 \
libmpfr.so.6 \
libsoup-3.0.so.0 \
libxml2.so.2"

inherit rpm
