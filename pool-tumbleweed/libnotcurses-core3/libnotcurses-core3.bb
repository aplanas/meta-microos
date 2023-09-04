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

RPM_NAME = "libnotcurses-core3-3.0.9-1.8.aarch64.rpm"
RPM_HASH = "e06fdd897bf4d3529a5e3b0eaf162459f1dfe40a3537cb0fc013a1a6a6cd2317ccf00ebe1f2afcc10f5f3d1f8565b48721c638e5d65278feda96e9c9941b558c"

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
