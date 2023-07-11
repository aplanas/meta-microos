SUMMARY = "Calendar applet for Budgie Desktop"
DESCRIPTION = "A budgie-desktop applet to show hours and when click show a calendar in a popover."
LICENSE = "GPL-2.0-or-later"

PV = "5.2"

RPM_NAME = "budgie-calendar-applet-5.2-2.13.aarch64.rpm"
RPM_HASH = "20560472a8302c61ce3e7f4614b787c0fb17c76e30f5ad49127c11e4b18b1a0a430f5b6170448d989da533637b29da6907fc1131c65d50a789965e07206a6cd2"

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
