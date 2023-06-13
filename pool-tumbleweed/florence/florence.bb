SUMMARY = "Extensible scalable on-screen virtual keyboard"
DESCRIPTION = "Florence is an extensible scalable virtual keyboard for X11. \
You need it if you can't use a real hardware keyboard, for \
example because you are disabled, your keyboard is broken or \
because you use a tablet PC, but you must be able to use a pointing \
device (as a mouse, a trackball or a touchscreen). \
 \
Florence stays out of your way when you don't need it: \
it appears on the screen only when you need it. \
A Timer-based auto-click functionality is available \
to help disabled people having difficulties to click."
LICENSE = "GPL-2.0-or-later & GFDL-1.2-only"

PV = "0.6.3"

RPM_NAME = "florence-0.6.3-5.10.aarch64.rpm"
RPM_HASH = "d01417dd25bbe55482ac204373644e0f61819eb273c9a8d44edf1f33fb3874c21226397278a5dfffc6ede55f16068a4a9f8126c634d1d68d5ba6f0e277956f32"

RPROVIDES:${PN} += "application() \
application(florence.desktop) \
florence \
florence(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXtst.so.6()(64bit) \
libatspi.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libflorence-1.0.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libnotify.so.4()(64bit) \
libpango-1.0.so.0()(64bit) \
librsvg-2.so.2()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
