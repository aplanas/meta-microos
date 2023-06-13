SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_memfile5_2-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "30163e306079e113845e3ba01466ebdf5588600f700beee05312eaeff13e0fd9dff572cc74254f1252db256126442147e6511a1080b024544b2ee4a6ea607bb5"

RPROVIDES:${PN} += "liballegro_memfile.so.5.2()(64bit) \
liballegro_memfile5_2 \
liballegro_memfile5_2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
liballegro.so.5.2()(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
