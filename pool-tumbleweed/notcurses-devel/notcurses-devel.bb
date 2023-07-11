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

RPM_NAME = "notcurses-devel-3.0.9-1.6.aarch64.rpm"
RPM_HASH = "6aaf96a8aad4078c9208ed7391418984705cd6d9806ddb359f68415f2541e0771fbb5cfaf1e3b71180bbf1483292d883938d11415113b5bf4e1417f8fc96749a"

RPROVIDES:${PN} += "cmake-Notcurses \
notcurses-devel \
pkgconfig-notcurses \
pkgconfig-notcurses-ffi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnotcurses3 \
pkgconfig-notcurses-core \
pkgconfig-notcurses-ffi"

inherit rpm
