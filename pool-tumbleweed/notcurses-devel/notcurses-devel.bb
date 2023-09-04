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

RPM_NAME = "notcurses-devel-3.0.9-1.8.aarch64.rpm"
RPM_HASH = "773ddc84e004cc5a09c2d4d87d702bcc3725728e81ce521db90dca9dbe51bbdb2262fbdf8661d07c14a8a76673c7e5f37b0906c115d105376442adf78d3f01b6"

RPROVIDES:${PN} += "cmake-Notcurses \
notcurses-devel \
pkgconfig-notcurses \
pkgconfig-notcurses-ffi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnotcurses3 \
pkgconfig-notcurses-core \
pkgconfig-notcurses-ffi"

inherit rpm
