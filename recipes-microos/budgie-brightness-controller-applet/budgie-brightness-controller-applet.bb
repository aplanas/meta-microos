SUMMARY = "Brightness controller applet"
DESCRIPTION = "Brightness Controller is a Budgie Desktop applet for productivity."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-brightness-controller-applet-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "184b56fb09f09679993bb67231996262b62598183375531892a82368a0ded4c561139377b58782a753a823bcfa3c7a4e369ebe63f0bf397f3fdb27309e82ffc3"

RPROVIDES:${PN} += "budgie-brightness-controller-applet budgie-brightness-controller-applet(aarch-64) libbrightnesscontroller.so()(64bit)"
RDEPENDS:${PN} += "budgie-extras-lang ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbudgie-plugin.so.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpeas-1.0.so.0()(64bit)"

inherit rpm
