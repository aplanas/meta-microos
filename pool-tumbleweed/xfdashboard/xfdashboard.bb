SUMMARY = "GNOME shell like dashboard for Xfce"
DESCRIPTION = "Xfdashboard provides a GNOME shell dashboard like interface for use with Xfce \
desktop. It can be configured to run to any keyboard shortcut and when executed \
provides an overview of applications currently open enabling the user to switch \
between different applications. The search feature works like Xfce's app finder \
which makes it convenient to search for and start applications."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "xfdashboard-1.0.0-1.4.aarch64.rpm"
RPM_HASH = "b51c93da63c2cd9b154f93e1377f5ef0395db3f6a383bf6da3bf36f0d785954b1499ede9739e74e04139c803a38facb41c358bd576e467c0faf6319fd203dd1a"

RPROVIDES:${PN} += "xfdashboard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk-module-common \
libclutter-1.0.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
libxfdashboard.so.0"

inherit rpm
