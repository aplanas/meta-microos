SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_dialog5_2-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "dd2a5ebaaf839b0c43dcffbdade4cedc04029f05622234f46a5d503665b711115c0f949b6f136f6035e013cf5b3ec521f173862be70623849199de2670a157f7"

RPROVIDES:${PN} += "liballegro_dialog.so.5.2()(64bit) \
liballegro_dialog5_2 \
liballegro_dialog5_2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
liballegro.so.5.2()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
