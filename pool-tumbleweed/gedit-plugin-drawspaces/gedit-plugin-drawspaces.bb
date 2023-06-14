SUMMARY = "Gedit drawspaces plugin"
DESCRIPTION = "The gedit drawspaces plugin."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gedit-plugin-drawspaces-44.1-1.3.aarch64.rpm"
RPM_HASH = "625c0d5e314f4c6b366ad225771b77e26ac0c592c13aae7e85d4d2a4893f84422bc148942692d52ab1e58fe24f23d435c8f2dc962f1a3521ab073bea55446495"

RPROVIDES:${PN} += "gedit-plugin-drawspaces \
gedit-plugins-/usr/lib64/gedit/plugins/drawspaces.plugin \
libdrawspaces.so"

RDEPENDS:${PN} += "gedit-plugins-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgedit-44.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtksourceview-4.so.0 \
libpeas-1.0.so.0 \
libpeas-gtk-1.0.so.0 \
libtepl-6.so.2"

inherit rpm
