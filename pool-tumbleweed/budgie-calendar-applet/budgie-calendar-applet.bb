SUMMARY = "Calendar applet for Budgie Desktop"
DESCRIPTION = "A budgie-desktop applet to show hours and when click show a calendar in a popover."
LICENSE = "GPL-2.0-or-later"

PV = "5.2"

RPM_NAME = "budgie-calendar-applet-5.2-2.12.aarch64.rpm"
RPM_HASH = "34d28f2cc675edee27f212db07754de8a66cb1b9aa264b2e4792dbbf5163c475662dae853a93c384b3d4c210b959e758aaad448902cb6285ee5d7bae0412dc46"

RPROVIDES:${PN} += "budgie-calendar-applet \
libcalendarapplet.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbudgie-plugin.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0"

inherit rpm
