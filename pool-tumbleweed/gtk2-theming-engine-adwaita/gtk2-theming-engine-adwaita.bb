SUMMARY = "Adwaita GTK+ Theming Engine"
DESCRIPTION = "Adwaita is the default GNOME theme in GNOME 3."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28"

RPM_NAME = "gtk2-theming-engine-adwaita-3.28-1.20.aarch64.rpm"
RPM_HASH = "f27b725bd5b289f7ec02c9833973af7a2fa41e074455ce2f2b202f9295ce61a5d23a8359d49372e9ed19b6887962748b421b43d474ec5e8747f5badda2e2b128"

RPROVIDES:${PN} += "gtk2-theming-engine-adwaita \
libadwaita.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
