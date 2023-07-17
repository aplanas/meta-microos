SUMMARY = "Character graphics and TUI library"
DESCRIPTION = "notcurses facilitates the creation of modern TUI programs, making \
full use of Unicode and 24-bit TrueColor. Its API is similar \
to that of NCURSES, but extends that with z-buffering, rendering \
of images and video using ffmpeg, alpha blending, widgets, palette \
fades, resize awareness, and multithreading support. \
 \
This subpackage contains shared library part of libnotcurses-core."
LICENSE = "Apache-2.0"

PV = "3.0.9"

RPM_NAME = "libnotcurses-core3-3.0.9-1.7.aarch64.rpm"
RPM_HASH = "28ea037a9be2ce60890ccee49c88d35a0ce335797b50f6b81b0bfe73b9f3fff632c9f171a825037a06c40469636e51d2c0e762aad88310079794f0795aa6ef4a"

RPROVIDES:${PN} += "libnotcurses-core.so.3 \
libnotcurses-core3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdeflate.so.0 \
libm.so.6 \
libqrcodegen.so.1 \
libtinfo.so.6 \
libunistring.so.5"

inherit rpm
