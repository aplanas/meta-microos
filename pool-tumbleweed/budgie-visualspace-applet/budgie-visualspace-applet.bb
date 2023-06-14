SUMMARY = "Visualspace applet"
DESCRIPTION = "Budgie VisualSpace shows the current workspace(s), as bullet(s). \
The applet includes a menu to navigate to either one of the windows or their corresponding workspace."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-visualspace-applet-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "6b5a67a76eb4f5c31481e232cb67233eda2cc919a4c4053e4f2de29c32655c27b6daf3186315d9496620c402783cfb83e72b765ef52b52362f62cccd392c0170"

RPROVIDES:${PN} += "budgie-visualspace-applet \
libvisualspace.so"

RDEPENDS:${PN} += "budgie-extras-lang \
ld-linux-aarch64.so.1 \
libbudgie-plugin.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0 \
libwnck-3.so.0"

inherit rpm
