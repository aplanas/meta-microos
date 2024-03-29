SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_dialog5_2-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "ac2f9ab6063d935feabf028a00b05c1719d07aeddd4c20691c8aaaea3f69c427654f1df2a24b84b326c15c0cf64b13122333a6e91facfffb1c9356d56ba66f03"

RPROVIDES:${PN} += "liballegro-dialog.so.5.2 \
liballegro-dialog5-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballegro.so.5.2 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
