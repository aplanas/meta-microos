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

RPM_NAME = "libnotcurses++3-3.0.9-1.8.aarch64.rpm"
RPM_HASH = "304e6935b045e6b4090cf7a09e8754f3e370076f31fbfaadee2e5127da5635ae59354fa8481f37ff1fa485b503ebd8edf2fbd021b942b265fdb13e9bd4399938"

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
