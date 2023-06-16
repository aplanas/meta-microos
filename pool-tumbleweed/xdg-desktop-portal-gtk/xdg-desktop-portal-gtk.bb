SUMMARY = "Backend implementation for xdg-desktop-portal using GTK+"
DESCRIPTION = "A backend implementation for xdg-desktop-portal that is using GTK+ and \
various pieces of GNOME infrastructure, such as the org.gnome.Shell.Screenshot \
or org.gnome.SessionManager D-Bus interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "xdg-desktop-portal-gtk-1.14.1-3.1.aarch64.rpm"
RPM_HASH = "3b6119c1777171cf7153a15a4e7f89a6d66defa55f7d0a42803e469d53639de0fde71ab706c2070b08d06fdde7e9b9847bad8b7043e473422300c23ee4a05feb"

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
