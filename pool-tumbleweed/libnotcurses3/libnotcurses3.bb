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

RPM_NAME = "libnotcurses3-3.0.9-1.8.aarch64.rpm"
RPM_HASH = "6d11a83ee66b08250394c31749a89a41dbb05afd8a7b9b734f7576a30eebd3c5401207e34df139e349b56c677f1bac8ac87cd759afe3cd2f2db5282019e733d5"

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
