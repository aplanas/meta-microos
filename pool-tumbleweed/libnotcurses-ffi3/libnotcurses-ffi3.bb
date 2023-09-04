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

RPM_NAME = "libnotcurses-ffi3-3.0.9-1.8.aarch64.rpm"
RPM_HASH = "b17c2e77ea9b89bd10f795b4f0ce2b9f9d85cce6a9d9264f9afc4569943f42bf5f2e968b1348da944fe0afdd05ae8d70153d48d9dac52143f58d9ac2361b7ccf"

RPROVIDES:${PN} += "libnotcurses-ffi.so.3 \
libnotcurses-ffi3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnotcurses-core.so.3"

inherit rpm
