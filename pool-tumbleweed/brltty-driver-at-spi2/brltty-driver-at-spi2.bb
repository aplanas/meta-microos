SUMMARY = "AT-SPI 2 driver for BRLTTY"
DESCRIPTION = "BRLTTY is a background process (daemon) which provides access to the \
Linux/Unix console (when in text mode) for a blind person using a \
refreshable braille display. It drives the braille display and provides \
complete screen review functionality. \
 \
This package contains the AT-SPI 2 screen driver."
LICENSE = "LGPL-2.1-or-later"

PV = "6.6"

RPM_NAME = "brltty-driver-at-spi2-6.6-1.1.aarch64.rpm"
RPM_HASH = "4f3883b2bb368ba28666ec62eb057101eda354414e7dbaee5bd43027628949f1050989c6e8a2d2451d26cf3339910c6e6f7443f93478a482b11d0535242be676"

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
