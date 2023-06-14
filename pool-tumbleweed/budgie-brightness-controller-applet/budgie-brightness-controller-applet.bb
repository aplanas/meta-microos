SUMMARY = "Brightness controller applet"
DESCRIPTION = "Brightness Controller is a Budgie Desktop applet for productivity."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-brightness-controller-applet-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "184b56fb09f09679993bb67231996262b62598183375531892a82368a0ded4c561139377b58782a753a823bcfa3c7a4e369ebe63f0bf397f3fdb27309e82ffc3"

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
