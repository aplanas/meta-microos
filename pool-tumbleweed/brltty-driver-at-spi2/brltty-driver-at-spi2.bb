SUMMARY = "AT-SPI 2 driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the AT-SPI 2 screen driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-driver-at-spi2-6.5-3.1.aarch64.rpm"
RPM_HASH = "3868edce20449ee8eb034223891c800887d4ab47c30eb1b8cde1a2183af0986008b47394f648cc963c382c02b635539071c7b0e78c255b2a542e8267ffc33934"

RPROVIDES:${PN} += "brltty-driver-at-spi2 \
libbrlttyxa2.so"

RDEPENDS:${PN} += "brltty \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXfixes.so.3 \
libatspi.so.0 \
libc.so.6 \
libdbus-1.so.3"

inherit rpm
