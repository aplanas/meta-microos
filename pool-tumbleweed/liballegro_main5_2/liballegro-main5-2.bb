SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library mainly aimed at \
video game and multimedia programming. It handles common, low-level \
tasks such as creating windows, accepting user input, loading data, \
drawing images, playing sounds, etc. and generally abstracting away \
the underlying platform. However, Allegro is not a game engine: \
developers are free to design and structure the program as desired."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_main5_2-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "633e09354abe6076fe0a34b48a42dc41c111dac3b7cd7aedad28f5486db48917603c82165a8371f44dd54458022e9e97cff67afa894862375c5c572de3250f72"

RPROVIDES:${PN} += "liballegro-main.so.5.2 \
liballegro-main5-2"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
