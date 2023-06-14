SUMMARY = "Development files for notcurses"
DESCRIPTION = "notcurses facilitates the creation of modern TUI programs, making \
full use of Unicode and 24-bit TrueColor. Its API is similar \
to that of NCURSES, but extends that with z-buffering, rendering \
of images and video using ffmpeg, alpha blending, widgets, palette \
fades, resize awareness, and multithreading support. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libnotcurses."
LICENSE = "Apache-2.0"

PV = "3.0.9"

RPM_NAME = "notcurses-devel-3.0.9-1.5.aarch64.rpm"
RPM_HASH = "05bf5c0b3d8217f3f0ea43aa3aa8ab25c6684a7aeec80c355f6840fbbc9f9545752de17afc7fb4ce06dc47263601071e8d36d9f6c3617fe2c89115beff583bbe"

RPROVIDES:${PN} += "cmake-Notcurses \
notcurses-devel \
pkgconfig-notcurses \
pkgconfig-notcurses-ffi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnotcurses3 \
pkgconfig-notcurses-core \
pkgconfig-notcurses-ffi"

inherit rpm
