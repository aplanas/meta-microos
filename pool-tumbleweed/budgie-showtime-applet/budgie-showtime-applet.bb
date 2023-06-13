SUMMARY = "Showtime applet"
DESCRIPTION = "Budgie Showtime is a digital desktop clock, showing time, and optionally, date. \
Textcolor of both can be set separately from the applet's menu."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-showtime-applet-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "760bbc6de2f52c4d40bfd0af7e2a7f3a6612dc5d2ded7fa55b7f3a70958ad1ff8d36086ba986ad04439ae9c73739068221568c8b6eb2b6ff744bdad4588adba1"

RPROVIDES:${PN} += "budgie-showtime-applet \
budgie-showtime-applet(aarch-64) \
libbudgieshowtime.so()(64bit)"

RDEPENDS:${PN} += "budgie-extras-lang \
dconf \
ld-linux-aarch64.so.1()(64bit) \
libbudgie-plugin.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpeas-1.0.so.0()(64bit) \
libwnck-3.so.0()(64bit)"

inherit rpm
