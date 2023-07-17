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

RPM_NAME = "libnotcurses3-3.0.9-1.7.aarch64.rpm"
RPM_HASH = "ea1b5ff8a0e290caa6398c367f7bed71d71a67584c548f90c6a206fb5588702a61519f51e20eed549fb735951d5413c9d30889f6a66e0552e8aea2218e8f2cb5"

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
