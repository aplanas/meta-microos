SUMMARY = "Development files for the X11 keyboard file manipulation library"
DESCRIPTION = "libxkbfile is used by the X servers and utilities to parse the XKB \
configuration data files. \
 \
This package contains the development headers for the library found \
in libxkbfile1."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "libxkbfile-devel-1.1.2-1.3.aarch64.rpm"
RPM_HASH = "31eec880fd0f6b35ce4a52c25d8ae8cf9708c55131be18ad5996a105acd41850b0377678d74eed53e3ddd642bdf6958b3635c423afed3dd911d7e82447104bbb"

RPROVIDES:${PN} += "libxkbfile-devel \
pkgconfig-xkbfile \
xorg-x11-libxkbfile-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxkbfile1 \
pkgconfig-kbproto \
pkgconfig-x11"

inherit rpm
