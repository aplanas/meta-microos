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

RPM_NAME = "florence-0.6.3-5.11.aarch64.rpm"
RPM_HASH = "ff1b144d1c6d5a890e02b2797da3f0ac195c25dd7fd09aae16b999d65fb2e89b9620338b3f67ca6a08b4ca998dd74f8096be8b786d76a7b26aa38a4fbe26f313"

RPROVIDES:${PN} += "florence"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXtst.so.6 \
libatspi.so.0 \
libc.so.6 \
libcairo.so.2 \
libflorence-1.0.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libnotify.so.4 \
libpango-1.0.so.0 \
librsvg-2.so.2 \
libxml2.so.2"

inherit rpm
