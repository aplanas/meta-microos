SUMMARY = "AT-SPI 2 driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the AT-SPI 2 screen driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-driver-at-spi2-6.5-2.4.aarch64.rpm"
RPM_HASH = "89db2fe6a907335a3b406215f7e9c5c2c92ea03e0026424b483e473d424877baf8f9a3b2e504e6f04074c5f141d9b9c2d4327604a25cc739859567e9434364f9"

RPROVIDES:${PN} += "brltty-driver-at-spi2 brltty-driver-at-spi2(aarch-64) libbrlttyxa2.so()(64bit)"
RDEPENDS:${PN} += "brltty ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXfixes.so.3()(64bit) libatspi.so.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit)"

inherit rpm
