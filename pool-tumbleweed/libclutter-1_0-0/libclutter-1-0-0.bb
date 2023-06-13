SUMMARY = "Library for creating dynamic graphical user interfaces"
DESCRIPTION = "Clutter is a library for creating fast, visually rich and animated \
graphical user interfaces. It uses OpenGL (or GLES) for rendering."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.4"

RPM_NAME = "libclutter-1_0-0-1.26.4-4.10.aarch64.rpm"
RPM_HASH = "8c26deddf813cf7b4dd10fe483e243f8fb36d40c4b6ecdc628c04a98f4ff9ad770801d88ba252e4834a8739631f4ec27628fcf9a0feae5be699b51558e5238c8"

RPROVIDES:${PN} += "clutter \
libclutter-1.0.so.0()(64bit) \
libclutter-1_0-0 \
libclutter-1_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libXdamage.so.1()(64bit) \
libXi.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libcogl-pango.so.20()(64bit) \
libcogl-path.so.20()(64bit) \
libcogl.so.20()(64bit) \
libfontconfig.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libinput.so.10()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpangoft2-1.0.so.0()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-cursor.so.0()(64bit) \
libwayland-server.so.0()(64bit) \
libxkbcommon.so.0()(64bit)"

inherit rpm
