SUMMARY = "Character graphics and TUI library"
DESCRIPTION = "notcurses facilitates the creation of modern TUI programs, making \
full use of Unicode and 24-bit TrueColor. Its API is similar \
to that of NCURSES, but extends that with z-buffering, rendering \
of images and video using ffmpeg, alpha blending, widgets, palette \
fades, resize awareness, and multithreading support. \
 \
This subpackage contains shared library part of libnotcurses."
LICENSE = "Apache-2.0"

PV = "3.0.9"

RPM_NAME = "libnotcurses3-3.0.9-1.6.aarch64.rpm"
RPM_HASH = "a6e685e467d898a54ff2a6ab04f47470af7ede69559f21fc48d40f1bd44052282d5abe18bfb7bdb9bcbed85b8978167d31a293695e0c655325b12e58280c3d21"

RPROVIDES:${PN} += "libnotcurses.so.3 \
libnotcurses3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libnotcurses-core.so.3 \
libswscale.so.7"

inherit rpm
