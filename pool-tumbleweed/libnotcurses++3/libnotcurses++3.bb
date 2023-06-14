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

RPM_NAME = "libnotcurses++3-3.0.9-1.5.aarch64.rpm"
RPM_HASH = "38a28d6d92d6a41109044455b92c495d8de1a7d6ddef73bd05add609e4a907b453bfa1d8a1c1a1335b21f29a860f492b41cf776171eabbbb63a63582e27506a8"

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
