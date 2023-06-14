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

RPM_NAME = "libnotcurses-core3-3.0.9-1.5.aarch64.rpm"
RPM_HASH = "33c75919cd0f9d653183e6fcb8b20f6caadcb41935be238bf9634b4881d0019964b4a37a900406b41e9b62c328beefd7e4c6920cf1ade56d20fd3385de809719"

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
