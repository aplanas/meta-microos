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

RPM_NAME = "libnotcurses++3-3.0.9-1.7.aarch64.rpm"
RPM_HASH = "ca530c6b1755f1bd9fc617c2ea9938d97bf33bd599de49370b6f839479278b6ca45fbeba36f0e219495421b96079c4f98b6d87be29f8c80fb658c2ce3af56b1a"

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
