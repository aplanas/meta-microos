SUMMARY = "Package compiler and linker metadata toolkit"
DESCRIPTION = "pkgconf is a program which helps to configure compiler and linker flags \
for development frameworks. It is similar to pkg-config from freedesktop.org \
and handles .pc files in a similar manner as pkg-config."
LICENSE = "ISC"

PV = "1.8.0"

RPM_NAME = "pkgconf-1.8.0-2.5.aarch64.rpm"
RPM_HASH = "2aced3e4ffb9b067bc21787e6e0c31bffd7dfe954cafafc1a70bf485e1adc4d88604d7ab2960b0b6dfb87f155a8b7339851ead47ad94d9b08d5391c905e9eb12"

RPROVIDES:${PN} += "pkgconf \
pkgconfig-pkgconf \
rpm-macro-pkgconfig-personalitydir"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpkgconf.so.3 \
libpkgconf3"

inherit rpm
