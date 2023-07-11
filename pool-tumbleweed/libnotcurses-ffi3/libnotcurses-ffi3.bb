SUMMARY = "Character graphics and TUI library (FFI version)"
DESCRIPTION = "notcurses facilitates the creation of modern TUI programs, making \
full use of Unicode and 24-bit TrueColor. Its API is similar \
to that of NCURSES, but extends that with z-buffering, rendering \
of images and video using ffmpeg, alpha blending, widgets, palette \
fades, resize awareness, and multithreading support. \
 \
This subpackage contains shared library part of libnotcurses (FFI \
version)."
LICENSE = "Apache-2.0"

PV = "3.0.9"

RPM_NAME = "libnotcurses-ffi3-3.0.9-1.6.aarch64.rpm"
RPM_HASH = "20575e24f4cf94a7c3d5aa9fd58120dda09533a038c15b9c270d8254c7b596b58eb27bae11354e46a894f041690532b6a137fba5576b2301659f40fca1fcfd47"

RPROVIDES:${PN} += "libnotcurses-ffi.so.3 \
libnotcurses-ffi3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnotcurses-core.so.3"

inherit rpm
