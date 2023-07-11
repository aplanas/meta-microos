SUMMARY = "Brightness controller applet"
DESCRIPTION = "Brightness Controller is a Budgie Desktop applet for productivity."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-brightness-controller-applet-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "e898b68fcda9a356e07cc7aa69a5c4f7324dc9b8c895e4bf1cc7ee6cd54cf40346b6851dd2d31fafb6b115ec5f8018d328b86e7ac8b2bf49a30fd73f5cf8c492"

RPROVIDES:${PN} += "budgie-brightness-controller-applet \
libbrightnesscontroller.so"

RDEPENDS:${PN} += "budgie-extras-lang \
ld-linux-aarch64.so.1 \
libbudgie-plugin.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0"

inherit rpm
