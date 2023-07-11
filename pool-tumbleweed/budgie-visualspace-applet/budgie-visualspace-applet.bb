SUMMARY = "Visualspace applet"
DESCRIPTION = "Budgie VisualSpace shows the current workspace(s), as bullet(s). \
The applet includes a menu to navigate to either one of the windows or their corresponding workspace."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-visualspace-applet-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "c15a22b4734292fd652adfe44ed3717f50f8fd6f07793c07a2a3c659302ce7e6ef7945566ab334a5d7ef37700506b8cbf83317be8b318a01d9869b9790d18dca"

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
