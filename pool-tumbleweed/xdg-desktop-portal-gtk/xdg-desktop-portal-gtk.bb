SUMMARY = "Backend implementation for xdg-desktop-portal using GTK+"
DESCRIPTION = "A backend implementation for xdg-desktop-portal that is using GTK+ and \
various pieces of GNOME infrastructure, such as the org.gnome.Shell.Screenshot \
or org.gnome.SessionManager D-Bus interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "xdg-desktop-portal-gtk-1.14.1-3.2.aarch64.rpm"
RPM_HASH = "a4a9e4a58e0f98ba9739e8cecee63f963d0e38e8de6480e7a51b39be235e1053a73b70f5bdcbcc204623b9af5aa793a5aa917010615c47b9f4f397a401f66349"

RPROVIDES:${PN} += "xdg-desktop-portal-gtk"

RDEPENDS:${PN} += "/usr/bin/sh \
gsettings-desktop-schemas \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
xdg-desktop-portal"

inherit rpm
