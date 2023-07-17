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

RPM_NAME = "libnotcurses-ffi3-3.0.9-1.7.aarch64.rpm"
RPM_HASH = "6ee88169a710673b1299de6e42cc3abca43bc31fbb55c1fc704d573a355b908db64113f7560578d23f48e283db8ebb22acf718eb0aef3bee8eb5e6b6b98fc11c"

RPROVIDES:${PN} += "libnotcurses-ffi.so.3 \
libnotcurses-ffi3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnotcurses-core.so.3"

inherit rpm
