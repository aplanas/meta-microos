SUMMARY = "A simple GTK notification daemon"
DESCRIPTION = "A simple notification daemon with a GTK gui for notifications and the control center"
LICENSE = "GPL-3.0-only"

PV = "0.8.0"

RPM_NAME = "SwayNotificationCenter-0.8.0-1.3.aarch64.rpm"
RPM_HASH = "9a5cf7be6343ef5bf9a6b8dd8671a941ca85a2e2e6a1ebd8013d682803f32b55b28c1c42a5651c3f8e457ecf940bbb271e469325e334b72e7e57687ace97e2c6"

RPROVIDES:${PN} += "SwayNotificationCenter SwayNotificationCenter(aarch-64) config(SwayNotificationCenter)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgee-0.8.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtk-layer-shell.so.0()(64bit) libhandy-1.so.0()(64bit) libhandy-1.so.0(LIBHANDY_1_0)(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libpango-1.0.so.0()(64bit) libpulse-mainloop-glib.so.0()(64bit) libpulse-mainloop-glib.so.0(PULSE_0)(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit)"

inherit rpm
