SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_main5_2-5.2.8.0-1.4.aarch64.rpm"
RPM_HASH = "919829391a184cb7f695c6fc78328acc51af98148d79a55b77cf9852b6ba48704d799132e9c45932122f66bf3b570abaa8611c27a6aa44168bd9be6e4597bc65"

RPROVIDES:${PN} += "liballegro-main.so.5.2 \
liballegro-main5-2"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
