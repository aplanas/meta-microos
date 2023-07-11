SUMMARY = "Character graphics and TUI library"
DESCRIPTION = "notcurses facilitates the creation of modern TUI programs, making \
full use of Unicode and 24-bit TrueColor. Its API is similar \
to that of NCURSES, but extends that with z-buffering, rendering \
of images and video using ffmpeg, alpha blending, widgets, palette \
fades, resize awareness, and multithreading support. \
 \
This subpackage contains shared library part of libnotcurses++."
LICENSE = "Apache-2.0"

PV = "3.0.9"

RPM_NAME = "libnotcurses++3-3.0.9-1.6.aarch64.rpm"
RPM_HASH = "3dad43f94472370849a0fd33945f51263f27359ab2eb337b5a669afd15a22c2e09b446eb7edeb6f7caffd4db843c0d1554740482973dfbe321a573f23bae5e9e"

RPROVIDES:${PN} += "libnotcurses++.so.3 \
libnotcurses++3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnotcurses-core.so.3 \
libnotcurses.so.3 \
libstdc++.so.6"

inherit rpm
