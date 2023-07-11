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

RPM_NAME = "libnotcurses-core3-3.0.9-1.6.aarch64.rpm"
RPM_HASH = "70641a15d29c9860188487a86b9a34c07acd80d7ede139ce0bfdcab51fb5f10075e89a1edbf78f63ab7c979d808a3e77f4a287ecd3c4a1b0b494d1ca8364ba44"

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
